<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <title>商品页面</title>

    <%--<script src="${APP_PATH}/js/jquery-3.1.1.js"></script>--%>
    <script type="text/javascript" src="${APP_PATH}/basic/js/jquery-1.7.min.js"></script>

    <link href="${APP_PATH}/amazeui-3.0.0-alpha.beta/AmazeUIdemo/assets/css/amazeui.min.css" rel="stylesheet"
          type="text/css">
    <script src="${APP_PATH}/amazeui-3.0.0-alpha.beta/AmazeUIdemo/assets/js/amazeui.min.js"
            type="text/javascript"></script>

    <%--<link href="${APP_PATH}/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet">--%>
    <%--<link href="${APP_PATH}/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet">--%>

    <link href="${APP_PATH}/basic/css/demo.css" rel="stylesheet" type="text/css"/>
    <%--<link type="text/css" href="${APP_PATH}/css/optstyle.css" rel="stylesheet"/>--%>
    <link type="text/css" href="${APP_PATH}/css/style.css" rel="stylesheet"/>
    <%--<script type="text/javascript" src="${APP_PATH}/basic/js/quick_links.js"></script>--%>
    <script type="text/javascript" src="${APP_PATH}/js/jquery.imagezoom.min.js"></script>
    <script type="text/javascript" src="${APP_PATH}/js/jquery.flexslider.js"></script>
    <%--<script type="text/javascript" src="${APP_PATH}/js/list.js"></script>--%>

    <%--<style>--%>
    <%--.talk_con {--%>
    <%--width: 600px;--%>
    <%--height: 500px;--%>
    <%--border: 1px solid #666;--%>
    <%--margin: 50px auto 0;--%>
    <%--background: #f9f9f9;--%>
    <%--}--%>

    <%--.talk_show {--%>
    <%--width: 580px;--%>
    <%--height: 420px;--%>
    <%--border: 1px solid #666;--%>
    <%--background: #fff;--%>
    <%--margin: 10px auto 0;--%>
    <%--overflow: auto;--%>
    <%--}--%>

    <%--.talk_input {--%>
    <%--width: 580px;--%>
    <%--margin: 10px auto 0;--%>
    <%--}--%>

    <%--.whotalk {--%>
    <%--width: 80px;--%>
    <%--height: 30px;--%>
    <%--float: left;--%>
    <%--outline: none;--%>
    <%--}--%>

    <%--.talk_word {--%>
    <%--width: 350px;--%>
    <%--height: 26px;--%>
    <%--padding: 0px;--%>
    <%--float: left;--%>
    <%--margin-left: 10px;--%>
    <%--outline: none;--%>
    <%--text-indent: 10px;--%>
    <%--}--%>

    <%--.talk_sub {--%>
    <%--width: 56px;--%>
    <%--height: 30px;--%>
    <%--float: left;--%>
    <%--margin-left: 10px;--%>
    <%--}--%>

    <%--.atalk {--%>
    <%--margin: 10px;--%>
    <%--}--%>

    <%--.atalk span {--%>
    <%--display: inline-block;--%>
    <%--background: #0181cc;--%>
    <%--border-radius: 10px;--%>
    <%--color: #fff;--%>
    <%--padding: 5px 10px;--%>
    <%--}--%>

    <%--.btalk {--%>
    <%--margin: 10px;--%>
    <%--text-align: right;--%>
    <%--}--%>

    <%--.btalk span {--%>
    <%--display: inline-block;--%>
    <%--background: #ef8201;--%>
    <%--border-radius: 10px;--%>
    <%--color: #fff;--%>
    <%--padding: 5px 10px;--%>
    <%--}--%>

    <%--.black_overlay {--%>
    <%--display: none;--%>
    <%--position: fixed;--%>
    <%--top: 0%;--%>
    <%--left: 0%;--%>
    <%--width: 100%;--%>
    <%--height: 100%;--%>
    <%--background-color: black;--%>
    <%--z-index: 1001;--%>
    <%---moz-opacity: 0.8;--%>
    <%--opacity: .80;--%>
    <%--filter: alpha(opacity=88);--%>
    <%--}--%>

    <%--.white_content {--%>
    <%--display: none;--%>
    <%--position: fixed;--%>
    <%--top: 0;--%>
    <%--left: 25%;--%>
    <%--width: 55%;--%>
    <%--height: 100%;--%>
    <%--padding: 20px;--%>
    <%--border: 10px solid orange;--%>
    <%--background-color: white;--%>
    <%--z-index: 1002;--%>
    <%--overflow: auto;--%>
    <%--}--%>
    <%--</style>--%>
</head>

<body>
<!--顶部导航条 -->
<jsp:include page="${APP_PATH}/jsp/common/top.jsp" flush="true"/>

<div class="clear"></div>
<b class="line"></b>
<div class="listMain">
    <!--分类-->
    <div class="nav-table">
        <div class="long-title">
            <a href="javascript:history.back(-1)" style="color: white">
                <span class="all-goods">返回上一页</span>
            </a>
        </div>
        <div class="nav-cont">
            <ul>
                <li class="index"><a href="${APP_PATH}/toHome">首页</a></li>
            </ul>
            <jsp:include page="${APP_PATH}/jsp/common/chaopoint.jsp" flush="true"/>
        </div>
    </div>
    <ol class="am-breadcrumb am-breadcrumb-slash">

    </ol>
    <script type="text/javascript">
        $(function () {
        });
        $(window).load(function () {
            $('.flexslider').flexslider({
                animation: "slide",
                start: function (slider) {
                    $('body').removeClass('loading');
                }
            });
        });
    </script>
    <div class="scoll">
        <section class="slider">
            <div class="flexslider">
                <ul class="slides">
                    <li><img src="${APP_PATH}/${requestScope.Goods.image}" title="pic"/></li>
                    <li><img src="${APP_PATH}/${requestScope.Goods.image}"/></li>
                    <li><img src="${APP_PATH}/${requestScope.Goods.image}"/></li>
                </ul>
            </div>
        </section>
    </div>
    <!--放大镜-->
    <div class="item-inform">
        <div class="clearfixLeft" id="clearcontent">
            <div class="box">
                <script type="text/javascript">
                    $(document).ready(function () {
                        $(".jqzoom").imagezoom();
                        $("#thumblist li a").click(function () {
                            $(this).parents("li").addClass("tb-selected").siblings().removeClass("tb-selected");
                            $(".jqzoom").attr('src', $(this).find("img").attr("mid"));
                            $(".jqzoom").attr('rel', $(this).find("img").attr("big"));
                        });
                    });
                </script>
                <div class="tb-booth tb-pic tb-s310">
                    <a href="${APP_PATH}/${requestScope.Goods.image}"><img src="${APP_PATH}/${requestScope.Goods.image}"
                                                                           alt="细节展示放大镜特效"
                                                                           rel="${APP_PATH}/${requestScope.Goods.image}"
                                                                           class="jqzoom"/></a>
                </div>
                <ul class="tb-thumb" id="thumblist">
                    <li class="tb-selected">
                        <div class="tb-pic tb-s40">
                            <a href="#"><img src="${APP_PATH}/${requestScope.Goods.image}"
                                             mid="${APP_PATH}/${requestScope.Goods.image}"
                                             big="${APP_PATH}/${requestScope.Goods.image}"></a>
                        </div>
                    </li>
                </ul>
            </div>
            <div class="clear"></div>
        </div>
        <div class="clearfixRight">
            <!--规格属性-->
            <!--名称-->
            <div class="tb-detail-hd">
                <h1>
                    ${requestScope.Goods.goodsname}
                </h1>
            </div>
            <div class="tb-detail-list">
                <!--价格-->
                <div class="tb-detail-price">
                    <li class="price iteminfo_price">
                        <dt>促销价</dt>
                        <dd><em>¥</em><b class="sys_item_price">${requestScope.Goods.goodsprice}</b></dd>
                    </li>
                    <li class="price iteminfo_mktprice">
                        <dt>原价</dt>
                        <dd><em>¥</em><b class="sys_item_mktprice">${requestScope.Goods.goodsprice}</b></dd>
                    </li>
                    <div class="clear"></div>
                </div>

                <div class="clear"></div>
            </div>
            <div class="theme-options">
                <dd>
                    <span id="Stock" class="tb-hidden">库存
                        <span class="stock">${requestScope.Goods.goodsnumber}
                        </span>件
                    </span>
                </dd>
                <span>购买数量：</span>
                <input id="number" type="number" value="1" style="width:60px;height: 30px;"/>
            </div>
        </div>

        <div class="pay">
            <li>
                <div class="clearfix tb-btn tb-btn-buy theme-login">
                    <a id="LikBuy" title="点此按钮到下一步确认购买信息">
                        立即购买
                    </a>
                    <script>
                        $('#LikBuy').click(function () {
                            var number = $('#number').val();
                            window.location.href = "${APP_PATH}/tolikPay/${requestScope.Goods.goodsid}/" + number;
                        })
                    </script>
                </div>
            </li>
            <li>
                <div class="clearfix tb-btn tb-btn-basket theme-login">
                    <a id="addToShopcart" title="加入购物车" href="#">
                        加入购物车
                    </a>
                </div>
            </li>
            <li>
                <div class="clearfix tb-btn theme-login">
                    <a id="chat" title="点击联系卖家" href="#">
                        点击联系卖家
                    </a>
                </div>
            </li>
        </div>
    </div>

    <div class="clear"></div>

    <div class="clear"></div>
    <!-- introduce-->
    <div class="introduce">
        <div class="browse">
            <div class="mc"></div>
        </div>
        <div class="introduceMain">
            <div class="am-tabs" data-am-tabs>
                <ul class="am-avg-sm-3 am-tabs-nav am-nav am-nav-tabs">
                    <li class="am-active">
                        <a href="#"> <span class="index-needs-dt-txt">宝贝详情</span></a>
                    </li>
                    <li>
                        <a href="#"> <span class="index-needs-dt-txt">全部评价</span></a>
                    </li>
                </ul>
                <div class="am-tabs-bd">
                    <div class="am-tab-panel am-fade am-in am-active">
                        <div class="J_Brand">
                            <div class="attr-list-hd tm-clear">
                                <h4>产品参数：</h4>
                            </div>
                            <div class="clear"></div>
                            <p>
                                ${requestScope.Goods.goodsinfo}
                            </p>
                            <div class="clear"></div>
                        </div>
                        <div class="details">
                            <div class="attr-list-hd after-market-hd">
                                <h4>商品细节</h4>
                            </div>
                            <div class="twlistNews">
                                <img src="${APP_PATH}/${requestScope.Goods.image}"/>

                            </div>
                        </div>
                        <div class="clear"></div>
                    </div>
                    <div class="am-tab-panel am-fade">
                        <div class="clear"></div>
                        <div class="clear"></div>
                        <ul class="am-comments-list am-comments-list-flip">

                            <li class="am-comment">
                                <!-- 评论容器 -->
                                <a href=""> <img class="am-comment-avatar" src="${APP_PATH}/images/hwbn40x40.jpg"/>
                                    <!-- 评论者头像 -->
                                </a>
                                <div class="am-comment-main">
                                    <!-- 评论内容容器 -->
                                    <header class="am-comment-hd">
                                        <!--<h3 class="am-comment-title">评论标题</h3>-->
                                        <div class="am-comment-meta">
                                            <!-- 评论元数据 --><a href="" class="am-comment-author">b***1
                                            (匿名)</a>
                                            <!-- 评论者 -->评论于
                                            <time datetime="">2015年11月02日 17:46</time>
                                        </div>
                                    </header>
                                    <div class="am-comment-bd">
                                        <div class="tb-rev-item " data-id="255776406962">
                                            <div class="J_TbcRate_ReviewContent tb-tbcr-content ">
                                                ${requestScope.result}
                                                ${requestScope.Comment.content}
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </li>

                        </ul>
                        <div class="clear"></div>
                        <!--分页 -->
                        <div class="clear"></div>
                        <div class="tb-reviewsft">
                            <div class="tb-rate-alert type-attention">购买前请查看该商品的 <a href="#" target="_blank">购物保障</a>，明确您的售后保障权益。
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="clear"></div>
            <jsp:include page="${APP_PATH}/jsp/common/bottom.jsp" flush="true"/>
        </div>
    </div>
</div>


<%--<div id="light" class="white_content">--%>
<%--<div class="talk_con">--%>
<%--<div class="talk_show" id="words">--%>

<%--</div>--%>

<%--<div class="talk_input">--%>
<%--<input type="text" class="talk_word" id="talkwords">--%>
<%--<input type="button" value="发送" class="talk_sub" id="talksub" href="javascript:void(0)">--%>
<%--<input type="button" value="关闭" class="talk_sub" id="closesub" href="javascript:void(0)">--%>
<%--</div>--%>
<%--</div>--%>
<%--</div>--%>


<%--<div id="fade" class="black_overlay"></div>--%>


<div class="am-modal am-modal-alert" tabindex="-1" id="addSuccess">
    <div class="am-modal-dialog">
        <div class="am-modal-hd">SimpleChange</div>
        <div class="am-modal-bd">
            加入购物车成功！
        </div>
        <div class="am-modal-footer">
            <button type="button" class="am-btn am-modal-btn am-btn-danger" id="toShopcart">前往购物车</button>
            <button type="button" class="am-btn am-modal-btn am-btn-primary" data-am-modal-confirm>确定</button>
        </div>
    </div>
</div>
</body>

</html>
<script>
    $('#addToShopcart').click(function () {
        var goodsidFkShopcart = '${requestScope.Goods.goodsid}';
        var number = $('#number').val();
        $.ajax({
            url: '${APP_PATH}/addToShopcart',
            type: 'POST',
            data: {
                "goodsidFkShopcart": goodsidFkShopcart,
                "number": number
            },
            success: function () {
                $('#addSuccess').modal({
                    onConfirm: function () {
                        window.location.reload();
                    }
                });
                $('#toShopcart').click(function () {
                    window.location.href = "${APP_PATH}/toShopcart";
                })
            }
        })
    });

    $('#number').change(function () {
        var num = document.getElementById('number').value;
        if (num >${requestScope.Goods.goodsnumber}) {
            alert("库存不足，请重新输入数量！");
            $('#number').val(1);
        }
        if (num === "") {
            alert("数量不能为空！");
            $('#number').val(1);
        }
        if (num <= 0 && num !== "") {
            alert("数量不合法！");
            $('#number').val(1);
        }
    });

</script>

<%--<script type="text/javascript">--%>
<%--$(function () {--%>
<%--&lt;%&ndash;var this_message = ${"<p>B说：还没呢，你呢？</p>"};&ndash;%&gt;--%>
<%--&lt;%&ndash;${"#words"}.html(this_message);&ndash;%&gt;--%>
<%--});--%>
<%--$(window).load(function () {--%>
<%--$('.flexslider').flexslider({--%>
<%--animation: "slide",--%>
<%--start: function (slider) {--%>
<%--$('body').removeClass('loading');--%>
<%--}--%>
<%--});--%>

<%--$("#chat").click(function () {--%>
<%--document.getElementById('light').style.display = 'block';--%>
<%--document.getElementById('fade').style.display = 'block';--%>
<%--var name1 = "${sessionScope.user.username}";--%>
<%--var name2 = "${requestScope.Goods.useridFkGoods}";--%>
<%--var ws;--%>
<%--var wsUri = "ws://172.29.19.240:8080/chat";--%>
<%--ws = new WebSocket(wsUri);--%>
<%--//alert("this");--%>

<%--ws.onopen = function () {--%>
<%--// n=prompt('请给自己取一个昵称：');--%>

<%--// name1=getQueryString("name1");--%>
<%--// name2 = getQueryString("name2");--%>

<%--// window.alert("this");--%>
<%--//m=m.substr(0,16);--%>
<%--//ws.send(n);--%>
<%--ws.send(name1 + " " + name2);//在服务端必须由OnMessage接收此消息--%>
<%--};--%>

<%--//处理连接后的信息处理--%>
<%--ws.onmessage = function (message) {--%>
<%--writeToScreen(message.data);--%>

<%--};--%>

<%--$("#talksub").click(function () {--%>
<%--message = document.getElementById('talkwords').value;--%>
<%--document.getElementById('talkwords').value = "";--%>
<%--//alert(message);--%>
<%--//towho = document.getElementById('towho').value + "@";--%>
<%--//window.alert("button");--%>
<%--if (message.length != 0) {--%>
<%--ws.send(message);--%>
<%--}--%>

<%--else {--%>

<%--}--%>
<%--})--%>

<%--//正则表达式方法获取URL中的参数--%>
<%--function getQueryString(name) {--%>
<%--var reg = new RegExp('(^|&)' + name + '=([^&]*)(&|$)', 'i');--%>
<%--var r = window.location.search.substr(1).match(reg);--%>
<%--if (r != null) {--%>
<%--return unescape(r[2]);--%>
<%--}--%>
<%--return null;--%>
<%--}--%>

<%--// 这样调用：--%>
<%--//alert(GetQueryString("参数名1"));--%>

<%--function writeToScreen(message) {--%>
<%--var x = new Array();--%>
<%--x = message.split(" ");--%>
<%--//$("#bsay").append(message+"<br>");--%>
<%--//alert(x[0]);--%>
<%--if (x[0] == (name1)) {--%>
<%--var $this_message = $("<div class='btalk'><span class='bsay'>" + x[1] + "</span></div>");--%>
<%--$("#words").append($this_message);--%>
<%--}--%>
<%--else {--%>
<%--var $this_message = $("<div class='atalk'><span class='asay'>" + x[1] + "</span></div>");--%>
<%--$("#words").append($this_message);--%>
<%--}--%>
<%--}--%>

<%--ws.onerror = function (evt) {--%>
<%--writeToScreen('<span style="color:red;">ERROR:</span>' + evt.data);--%>
<%--ws.close();--%>
<%--};--%>

<%--$("#closesub").click(function () {--%>
<%--ws.close();--%>
<%--document.getElementById('light').style.display = 'none';--%>
<%--document.getElementById('fade').style.display = 'none';--%>
<%--})--%>
<%--})--%>

<%--});--%>
<%--</script>--%>