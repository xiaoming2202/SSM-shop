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
<div class="width1200 center_yh hidden_yh">
    <div class="width100"style="height: 45px;line-height: 45px;border-bottom: 2px solid #dd4545;margin-top: 20px;">
        <font class="left_yh font20">折扣大促销</font>
    </div>
    <div class="width100 hidden_yh" style="height: 480px;">
        <div class="normalPic">
            <c:forEach items="${zks}" var="data" varStatus="1">
                <a href="${ctx}/item/view?id=${data.id}">
                    <h3 class="yihang c_33 font14 font100" style="padding-left: 10px;padding-right: 10px;">${data.name}</h3>
                    <p class="red font14" style="padding-left:10px;">${data.price}</p>
                <img src="${data.url1}" width="105"height="118" alt=""style="margin: 0 auto">
                </a>
            </c:forEach>
        </div>
    </div>
</div>



<%@include file="/common/ufooter.jsp"%>

</body>
</html>