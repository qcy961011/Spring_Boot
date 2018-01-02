<%@page import="cn.lanqiao.entity.User"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<%
	User user = (User)session.getAttribute("user");
	
%>
<html>
<head>
    <meta charset="utf-8" />
    <title>后台登录</title>
    <meta name="author" content="DeathGhost" />
    <link rel="stylesheet" type="text/css" href="css/style.css" />
    <style>
        body {
            height: 100%;
            background: #16a085;
            overflow: hidden;
        }
        canvas {
            z-index: -1;
            position: absolute;
        }
    </style>
    <script src="js/jquery.js"></script>
    <script src="js/verificationNumbers.js"></script>
    <script src="js/Particleground.js"></script>
    <script>
        $(document).ready(function() {
            //粒子背景特效
            $('body').particleground({
                dotColor : '#5cbdaa',
                lineColor : '#5cbdaa'
            });
        });
    </script>
</head>
<body>

<!--弹出框效果-->
<script>
    $(document).ready(function(){
        //弹出文本性提示框
        $(".pop_bg").fadeIn();


        //弹出：确认按钮
        $(".trueBtn").click(function(){
        	alert("前台商城页面");
          //  location.href='/market/shop/index.html';

        });
        //弹出：取消或关闭按钮
        $(".falseBtn").click(function(){
            location.href='/market/login/login.html';
        });
    });
</script>
<section class="pop_bg">
    <div class="pop_cont">
        <!--title-->
        <h3>注册信息</h3>
        <!--content-->
        <div class="pop_cont_input">
            <ul>
                <li>
                    <span>恭喜您，注册成功，您的信息如下</span>
                    <br>
                </li>
                <li>
                    账号：<p><%=user.getUsername() %></p><br>
                </li>
                <li>
                    真实姓名：<p><%=user.getRealname() %></p><br>
                </li>
                <li>
                    联系电话：<p><%=user.getPhone() %></p><br>
                </li>
                <li>
                    地址：<p><%=user.getAddress() %></p><br>
                </li>
            </ul>
        </div>
        <!--以pop_cont_text分界-->
        <div class="pop_cont_text">
            欢迎您使用本商城
        </div>
        <!--bottom:operate->button-->
        <div class="btm_btn">
            <input type="button" value="进入商城" class="input_btn trueBtn"/>
            <input type="button" value="返回登录页面" class="input_btn falseBtn"/>
        </div>
    </div>
</section>
<!--结束：弹出框效果-->


<script src="js/amcharts.js" type="text/javascript"></script>
<script src="js/serial.js" type="text/javascript"></script>
<script src="js/pie.js" type="text/javascript"></script>
</body>
</html>
