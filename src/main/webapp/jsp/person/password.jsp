<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <title>修改密码</title>

    <script src="${APP_PATH}/js/jquery-3.1.1.js"></script>

    <link href="${APP_PATH}/amazeui-3.0.0-alpha.beta/AmazeUIdemo/assets/css/amazeui.min.css" rel="stylesheet"
          type="text/css">
    <script src="${APP_PATH}/amazeui-3.0.0-alpha.beta/AmazeUIdemo/assets/js/amazeui.min.js"
            type="text/javascript"></script>

    <%--<link href="${APP_PATH}/AmazeUI-2.4.2/assets/css/amazeui.min.css" rel="stylesheet"/>--%>
    <%--<script src="${APP_PATH}/AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>--%>

    <link href="${APP_PATH}/css/personal.css" rel="stylesheet" type="text/css">
    <link href="${APP_PATH}/css/stepstyle.css" rel="stylesheet" type="text/css">

    <link href="${APP_PATH}/css/jquery.toast.min.css" rel="stylesheet">
    <script type="text/javascript" src="${APP_PATH}/js/jquery.toast.min.js"></script>
</head>

<body>
<!--头 -->
<header>
    <article>
        <div class="mt-logo">
            <!--顶部导航条 -->
            <jsp:include page="${APP_PATH}/jsp/common/top.jsp" flush="true"/>
            <div class="clear"></div>
        </div>
    </article>
</header>
<div class="nav-table">
    <div class="long-title"><span class="all-goods">全部分类</span></div>
    <div class="nav-cont">
        <ul>
            <li class="index"><a href="${APP_PATH}/toHome">首页</a></li>
        </ul>
        <jsp:include page="${APP_PATH}/jsp/common/chaopoint.jsp" flush="true"/>
    </div>
</div>
<b class="line"></b>
<div class="center">
    <div class="col-main">
        <div class="main-wrap">
            <div class="am-cf am-padding">
                <div class="am-fl am-cf"><strong class="am-text-danger am-text-lg">修改密码</strong> /
                    <small>Password</small>
                </div>
            </div>
            <hr/>

            <form id="passwordUpdate" class="am-form" style="padding-top: 50px" data-am-validator>
                <div class="am-form-group">
                    <label for="oldPassword">原密码：</label>
                    <input type="password" id="oldPassword" placeholder="原密码" required/>
                </div>

                <div class="am-form-group">
                    <label for="userpassword">新密码：</label>
                    <input type="password" id="userpassword" name="userpassword" placeholder="新密码" required/>
                </div>

                <div class="am-form-group">
                    <label for="p2">确认密码：</label>
                    <input type="password" id="p2" placeholder="请与上面输入的值一致" data-equal-to="#userpassword" required/>
                </div>

                <button id="passwordUpdateBtn" class="am-btn am-btn-secondary" type="button">提交</button>
            </form>

        </div>
        <!--底部-->
        <jsp:include page="${APP_PATH}/jsp/common/bottom.jsp" flush="true"/>
    </div>
    <aside class="menu">
        <ul>
            <li class="person"><a href="${APP_PATH}/toUserInfo" style="font-size: 16px">个人中心</a></li>
            <hr/>
            <li class="person" style="font-size: 15px;font-weight: bold"> 个人资料
                <hr/>
                <ul>
                    <li class="active"><a href="${APP_PATH}/toUserInfo">个人信息</a></li>
                    <li><a href="${APP_PATH}/toAddress">收货地址</a></li>
                </ul>
            </li>
            <li class="person" style="font-size: 15px;font-weight: bold"> 我的交易
                <hr/>
                <ul>
                    <li><a href="${APP_PATH}/toOrderItem">订单管理</a></li>
                </ul>
                <ul>
                    <li><a href="${APP_PATH}/toGoodsManage">管理我的商品</a></li>
                </ul>
            </li>
            <li class="person" style="font-size: 15px;font-weight: bold"> 我的资产
                <hr/>
                <ul>
                    <li><a href="${APP_PATH}/toBill">账单明细</a></li>
                </ul>
            </li>
        </ul>
    </aside>
</div>
</body>

</html>

<script>

    $('#oldPassword').blur(function () {
        $.ajax({
            type: "post",
            url: "/confirmOldPassword",
            data: {"oldPassword":$('#oldPassword').val()},
            success: function (result) {
                if (result.code === 200) {
                    $.toast({
                        text: "原密码不正确",
                        showHideTransition: 'slide',
                        hideAfter: false,
                        position: 'top-right'
                    });
                    $('#passwordUpdate')[0].reset();
                    $('#oldPassword').focus();
                }
            }
        })
    });

    $('#passwordUpdateBtn').click(function () {
        if ($('#p2').val() !== $('#userpassword').val()) {
            $.toast({
                text: '请确认密码',
                showHideTransition: 'slide',
                hideAfter: false,
                position: 'top-right'
            });
            $('#p2').focus();
        }else if($('#oldPassword').val()===""){
            $.toast({
                text: '请确认原密码',
                showHideTransition: 'slide',
                hideAfter: false,
                position: 'top-right'
            });
            $('#oldPassword').focus();
        }else {
            $.ajax({
                type: "post",
                url: "/passwordUpdate",
                data: $('#passwordUpdate').serialize(),
                success: function (result) {
                    if (result.code === 100) {
                        $.toast({
                            heading: "Success",
                            text: '密码修改成功',
                            showHideTransition: 'slide',
                            hideAfter: 1000,
                            afterHidden: function () {
                                window.location.reload();
                            },
                            position: 'top-right',
                            icon: 'success'
                        })
                    } else {
                        $.toast({
                            heading: "Fail",
                            text: result.extend.errorFields.userpassword,
                            showHideTransition: 'slide',
                            hideAfter: false,
                            position: 'top-right'
                        });
                    }
                },
                error: function () {
                    $.toast({
                        heading: "Fail",
                        text: "用户信息更新失败",
                        showHideTransition: 'fade',
                        position: 'top-right'
                    })
                }
            })
        }
    })
</script>
