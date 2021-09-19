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
    <span>当前位置：</span><a href="${ctx}/login/uIndex"class="c_66">首页</a>>
    <a href="#" class="c_66">商品列表</a>
</div>
<div class="width1198 center_yh"style="height: 35px;background: #f0f0f0;border: 1px solid #ddd;
margin-top: 25px;">
    <a href="${ctx}/item/shopList?categoryIdTwo=${obj.categoryIdTwo}" class="mR">默认</a>
    <a href="${ctx}/item/shopList?price=1&categoryIdTwo=${obj.categoryIdTwo}" class="mR">价格
    <img src="${ctx}/resource/user/images/gg.png" alt="">
    </a>
    <a href="${ctx}/item/shopList?gmNum=1&categoryIdTwo=${obj.categoryIdTwo}" class="mR">销量
        <img src="${ctx}/resource/user/images/gg.png" alt="">
    </a>
</div>


<!--商品列表-->
<div class="width1200 center_yh hidden_yh " style="margin-top: 25px;">
    <ul class="listSs">
        <c:forEach items="${pagers.datas}" var="data" varStatus="1">
            <li>
                <a href="${ctx}/item/view?id=${data.id}" class="bjk">
                    <img src="${data.url1}" alt="">
                </a>
                <h3 class="spName">${data.name}</h3>
                <p class="center_yh block_yh hidden_yh"style="width:202px;">
                    <font class="left_yh red font16">￥${data.price}</font>
                    <c:if  test="${data.zk!=null}">
                        <span class="right_yh red font14">
                            ￥${data.zk}
                        <span style="color:red">折</span>
                        </span>
                    </c:if>
                </p>
                <div class="wCa">
                    <a href="${ctx}/sc/exAdd?itemId=${data.id}" class="fav">
                        <div class="wCa1">
                            <b><img src="${ctx}/resource/user/images/star.png"  alt=""> </b>
                        <font>收藏</font>
                        </div>
                    </a>
                         <div class="wCa2" onclick="addcar('${data.id}')">
                            <b><img src="${ctx}/resource/user/images/star.png"  alt=""> </b>
                            <font>加入购物车</font>
                        </div>
                 </div>
            </li>
        </c:forEach>
    </ul>
</div>
<div id="navs">
    <div class="pagelist">
        <!--分页开始-->
<pg:pager url="${ctx}/item/shopList" maxIndexPages="8" items="${pagers.total}"
maxPageItems="15" export="curPage=pageNumber">
    <pg:param name="categoryIdTwo" value="${obj.categoryIdTwo}"/>
    <pg:param name="price" value="${obj.price}"/>
    <pg:param name="gmNum" value="${obj.gmNum}"/>
    <pg:param name="condition" value="${condition}"/>
</pg:pager>
    </div>


</div>
<script >
    function addcar(id){
    alert("已放入购物车");
    }
</script>
<%@include file="/common/ufooter.jsp"%>

</body>
</html>