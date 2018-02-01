hibernate
-----
# 基础接口
## 1.configuration
用于解析hibernate.cfg.xml文件和XXXXX.hbm.xml文件，并创建SessionFactry对象。configuration对象用于配置并且启动Hibernate。Hibernate应用通过Configuration实例来指定对象--关系映射文件的位置或者动态配置Hibernate的属性，然后创建SessionFactory实例。
## 2.SessionFactory
初始化Hibernate，充当数据存储源的代理，创建Session对象。一个SessionFactory实例对应一个数据存储源，Session实例应该从SessionFactory中获得。如果应用同时访问多个DB,则需要为每个数据库创建一个单独的SessionFactory实例。
## 3.Session 
持久化管理器。对象级数据库操作
* 1.不是线程安全的，因此在设计软件架构时，应该避免多个线程共享同一个Session实例。

* 2.Session实例是轻量级的，所谓轻量级，是指它的创建和销毁不需要消耗太多的资源。这意味着在程序中可以经常的创建或者销毁Session对象，例如为每个客户请求分配单独的Session实例，或者为每个工作单位分配单独的Session实例。

* 3.通常将每一个Session实例和一个DB事务绑定，也就是说，每执行一个DB事务，都应该先创建一个新的Session实例，不论事务执行成功，最后都应该调用Session的close()方法，从而释放Session实例占用的资源。(PS：每个Session实例都有自己的缓存，这个sessio实例的缓存只能被当前的工作单元访问。)

## 4.Query
执行数据库查询操作。要使用HQL（HibernateQueryLanguage）查询语句，HQL查询语句是面向对象的，他引用类名及类的属性名。

## 5.Transaction
用于管理操作事务。它对底层的事务接口做了封装，底层事务接口包括：JDBC API、JTA（JavaTransactionAPI）、CORBA（CommonObjectRequestBroker Architcture）API

--------
# 工作原理
## 1.Hibernate的初始化
读取Hibernate的配置信息->创建SessionFactory
* 1.创建Configeration类的实例：它的构造方法：将配置信息(hibernate config.xml)读入内存中。一个Configeration实例代表Hibernate所有Java类到SQL数据库映射的集合。
* 2.创建SessionFactory实例
把Configeration对象中的所有配置信息拷贝到SessionFactory的缓存中。 SessionFactory的是这里代表一个数据库存储源、创建后不再与Configeration对象关联。<br>
	缓存(cache):指Java对象的属性（通常是一些集合类型的属性）--占用内存空间。SessionFactory的缓存中有：HIbernate配置信息。OR映射元数据。 缓存 - 大 ： 重量级对象 ； 小 ： 轻量级对象。
* 3.调用SessionFactory创建session的方法<br>
	1.用户自行提供JDBC链接：<br>
	Connection con = dataSource.getConnection();<br>
	Session s = sessionFactory.openSession();<br>
	2.让SessionFactory提供链接：<br>
	Session s = sessionFactory.openSession();
* 4.通过Session接口提供的各种方法来操作数据库访问
-------

# 缓存
## 1.为什么使用缓存
hibernate使用缓存减少对数据库的访问次数，从而提高hibernate的执行效率.
<br>
hibernate中有两种类型的缓存：一级缓存和二级缓存。

## 2.一级缓存
hibernate中一级缓存，也叫做session的缓存，当调用session的 save/saveOrUpdate/get/load/list/iterator方法的时候，都会把对象放入session的缓存中。<br>
一级缓存可以在session范围内减少数据库的访问次数，只在session范围有效，session关闭，一级缓存失效。<br>
session的缓存由hibernate维护，用户不能操作缓存内容；如果想操作缓存内容，必须通过hibernate提供的evit/dear方法操作。
## 特点：
* 只在当前session范围有效，作用时间短，效果不是特别的明显。
* 如果在短时间内多次操作数据库，效果比较明显！
<br>

## list 和 iterator的区别
* list : 一次把所有的记录都查询出来，会放入缓存，但是不会从缓存中获取数据
* Iterator : N+1查询；N表示所有的记录总数，即会先发送一条语句查询所有记录的主键(1),在根据每一个主键再去数据库查询(N),会放入缓存，也会从缓存中取数据