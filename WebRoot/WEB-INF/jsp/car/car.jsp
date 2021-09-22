<%@page language="java" contentType="text/html; character=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/common/taglibs.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>首页</title>
    <link type="text/css" rel="stylesheet" href="${ctx}/resource/user/css/style.css">
    <script src="${ctx}/resource/user/js/jquery-1.8.3.min.js"></script>
    <script src="${ctx}/resource/user/js/jquery.luara.0.0.1.min.js"></script>
</head>
<body>
<%@include file="/common/utop.jsp"%>
<!--导航条-->
<div class="width100" style="height: 45px;background: #dd4545;margin-top: 40px;position: relative;z-index:100;">
    <div class="width1200 center_yh relative_yh" style="height: 45px;">

        <div class="left_yh font16" id="pageNav">
            <!--普通导航-->
            <a href="${ctx}/login/uIndex">首页</a>
            <a href="${ctx}/news/list">公告</a>
            <a href="${ctx}/message/add">留言</a>
        </div>
    </div>
</div>
<!--折扣商品-->
<div class="width1200 center_yh hidden_yh font14" style="height:40px;line-height:
40px;">
    <span>当前位置：</span><a href="${ctx}/login/uIndex"class="c_66">首页></a>>
    <a href="#" class="c_66">我的购物车></a>
</div>

<div class="width1200 hidden_yh center_yh font20">
    全部商品<font class="red">(${fn:length(list)})</font>
</div>
<div class="width1200 hidden_yh center_yh "style="border:1px solid #dddddd;margin-top: 18px;min-height:300px;">
    <div class="width100 hidden_yh font14"style="height: 32px;line-height: 32px;background: #f0f0f0;text-indent: 21px;color: #0000cc;font-weight: 600;border-bottom: 1px solid #ddd;">
        商品详情
    </div>
    <div class="width100 hidden_yh fon14"style="height: 42px;line-height: 42px;border-bottom: 1px solid #ddd;">
        <div class="left_yh tcenter font14"style="width:486px;">商品</div>
        <div class="left_yh tcenter font14"style="width:175px;">价格</div>
        <div class="left_yh tcenter font14"style="width:175px;">数量</div>
        <div class="left_yh tcenter font14"style="width:175px;">小计</div>
        <div class="left_yh tcenter font14"style="width:175px;">操作</div>
    </div>
    <c:forEach items="${list}" var="data" varStatus="1">
        <div class="specific" data-id="${data.id}">
            <div class="xzWxz">
                <b><img src="${ctx}/resource/user/images/xzwxz.png" alt=""></b>
            </div>
            <div class="xzSp">
                <img src="${data.item.url1}">
                <div class="xzSpIn">
                <h3 class="font16 c_33 font1000">${data.item.name}</h3>
                </div>
            </div>

        </div>
    </c:forEach>


</div>
<script>
    $(".xzWxz").click(function (){
       if ($(this).hasClass("on")){
           $(this).removeClass("on");
       } else{
           $(this).addClass("on");
       }
    });
</script>
<%@include file="/common/ufooter.jsp"%>

</body>
</html>