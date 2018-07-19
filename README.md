![Login](/readme/login-2018-07-04.png)

# SimpleChange电子商务系统

使用SSM框架的第一个基本自己完成的简单项目，前端页面主要使用的是AmazeUI框架和JQuery及简单的ajax,后端SSM

## 系统模块

1. 商品管理模块：实现发布商品，修改商品信息，下架商品等功能；用户无需切换身份，即可发布商品，可以随时修改商品信息，将商品进行下架操作等；
2. 用户管理模块：实现用户注册，登录，查询和修改个人信息，浏览商品，对个人购物车管理等功能；用户提交注册，并进行邮箱激活，即可登录，用户可在个人面板中修改个人信息，包括上传头像，修改用户名，修改密码，编辑地址等；
3. 购物车管理模块：实现添加商品到购物车，清空购物车，删除购物车商品功能；用户可通过搜索或分类进行商品浏览，并将喜欢的商品加入购物车，用户可以对购物车中的商品进行删除，修改操作，也可将购物车一键清空，删除购物车中的所有商品；
4. 订单管理模块：实现提交订单，查看订单，删除订单功能；用户可以将商品添加到购物车之后，勾选要购买的商品进行结算，也可以从商品主页面直接点击立即购买按钮进行结算，提交订单后，用户可查看个人历史订单，也可以对订单进行删除操作；
5. 积分管理模块：实现积分查询和积分抽奖功能；用户购买商品成功后，即可获得积分，当用户的积分达到100时即可进行积分抽奖，一次消耗100积分，用户可以随时查看自己的积分余额；
6. 用户交流模块：实时发送消息，接收消息功能；用户在商品主页面可以点击与卖家联系按钮，即可与卖家进行聊天，用户也可以查看历史消息；
7. 评价模块：实现发布评价，查看评价功能；用户在收到货物之后，可以对订单进行评价，评价内容会展示在商品详情页面，用户可通过个人面板查看自己的历史评价； 


## 技术点

 - 基础框架：SpringMVC+Spring+MyBatis
 - 数据库：MySQL
 - 前端框架：AmazeUI
 - 项目依赖管理：Maven
 - 逆向工程：MyBatis Generator
 - 加密：DES
