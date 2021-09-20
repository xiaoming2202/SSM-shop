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
    <a href="#" class="c_66">详情</a>

</div>
<div class="width1198 center_yh" style=" height: 420px;">
    <div class="left_yh"style="width: 350px;height: 420px;">
        <input type="hidden"id="id" value="${obj.id}">
        <div id="preview">
            <div>
                <img src="${obj.url1}"alt="" height="350"width="350">
            </div>
            <div id="spec-list" style="margin-top: 5px;">
                <ul class="list-h">
                    <li><img src="${obj.url2}" height="80"width="80"> </li>
                    <li><img src="${obj.url3}" height="80"width="80"> </li>
                    <li><img src="${obj.url4}" height="80"width="80"> </li>
                    <li><img src="${obj.url5}" height="80"width="80"> </li>
                </ul>
            </div>
        </div>
    </div>
    <div class="left_yh"style="width: 486px;height: 420px;margin-left: 42px;">
    <h3 class="font20 font100">${obj.name}</h3>
        <p class="font16 c_66" style="margin-top: 25px;">
            <font style="margin-right: 20px;">价格：</font>
            <font class="red font20">￥${obj.price}</font>
        </p>

        <c:if test="${obj.zk!=null}">
            <p class="font16 c_66" style="margin-top: 25px;">
                <font style="margin-right: 20px;">促销：</font>
                <font class="red font20">${obj.zk}
                <span style="color: red">折</span>
                </font>
            </p>
        </c:if>
        <p class="font16 c_66 likeColor"style="margin-top25px;">
            <font style="margin-right: 20px;">数量：</font>
            <a href="javascript:void(0)" id="min_s">-</a>
            <input type="text"value="1"readonly id="t_a">
            <a href="javascript:void(0)" id="add_s">+</a>
            <font class="font14 c_99" style="margin-left: 20px;">库存100</font>
            <script>
            var tr=$("#t_a").val();
            $("#min_s").click(function (){
               tr--;
               if (tr<1){
                   $("#t_a").val(1);
                   tr = 1;
               }else{
                   $("#t_a").val(tr);
               }
            });

            $("#add_s").click(function (){
                tr++;

                    $("#t_a").val(tr);

            });


            </script>
        </p>
<div class="buyFor">
    <a href="${ctx}/sc/exAdd?itemId=${obj.id}" class="mstBuy">收藏</a>
    <a href="javascript:void(0)"class="addCar">加入购物车</a>
</div>
    </div>
    </div>

<div class="width1200 hidden_yh center_yh"style="margin-top: 40px;">
    <div class="right_yh" style="width: 1200px;">
        <div class="hidden_yh"id="spXqpj">
            <a href="javascript:void(0)"class="on">商品详情</a>
            <a href="javascript:void(0)">商品评价</a>
        </div>
        <div class="width100 hidden_yh">
            <div id="spDetail">
                ${obj.ms}
            </div>
            <div id="spPj">
                商品评价
            </div>
        </div>
    </div>
</div>

<script >
    $("#spXqpj a").click(function (){
        $(this).addClass("on").siblings().removeClass("on");
    });
    $("#spXqpj a").eq(0).click(function (){
        $("#spDetail").css({display:"block"}).siblings().css({display:"none"});
    });
    $("#spXqpj a").eq(1).click(function (){
        $("#spPj").css({display:"block"}).siblings().css({display:"none"});
    });

    $(function(){
     $(".addCar").click(function (){
         var id=$("#id").val();
         var num=$("#t_a").val();
         $.ajax({
             type:"POST",
             url:"${ctx}/car/exAdd?itemId="+id+"&num=1",
             success:function (result){
                 var re=result;
                 if (re.res==0){
                     alert("请登录");
                     window.location.href="${ctx}/login/uLogin";
                 }
                 else{
                     window.location.href="${ctx}/car/findBySql";
                 }
             }
         });
     });
    });
</script>
<%@include file="/common/ufooter.jsp"%>

</body>
</html>