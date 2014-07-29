<%@ page language="java"
	import="java.util.*,com.menu.entity.*,com.menu.operation.*"
	pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=gb2312"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<html>
<body background="image/33.jpg">
	<div id="jieshaozicss"
		style="position:absolute;left:160px;top:20px;width:690px;height:20px;z-index:1;">
		<p align="center">
			<font color="white">菜肴介绍</font>
		</p>
		<hr style="border:2px,dashed #000;height:2px">
	</div>
	<div id="zaobaowujijieshaocss"
		style="position:absolute;left:160px;top:70px;width:690px;height:350px;z-index:1;">
		<p>
			<strong>主料：</strong>
		</p>
		新鲜猪肉（后臀尖，带皮）1000克，鸡腿500克 做法：
		<p>
			<strong>辅料:</strong>
		</p>
		生姜，大葱，豆蔻，红腐乳，大料，盐，白酒适量
		<p>
			<strong>调料：</strong>
		</p>
		姜5克,盐2克
		<p>
			<strong>做法：</strong>
		</p>
		猪肉切块（2cm长，1。5cm宽），鸡腿剁成小块，放入凉水中，加热至水开，捞出鸡块猪肉块，噔干水；铁锅中倒油，糖，加热，用铲子不停搅，待油糖混合颜色变深，气泡；一分钟后，放鸡块，猪肉块，搅拌，倒入酱油，搅拌，加水，放入辅料，盖上盖子，大火烧至水开，减小火，间或用铲子翻翻，慢慢炖熟。

		2、将排骨放入锅内，加入水（以漫过排骨为度）、酱油、料酒、精盐、大料、葱段、姜片，尝好味，用大火烧开后，转微火焖至排骨肉烂即成。
	</div>
	<div id="mizhirou"
		style="position:absolute;left:600px;top:110px;width:200px;height:200px;z-index:1;">
		<img src="image/30.jpg" width="200" height="200">
	</div>
	<p> </p>
	<p> </p>
</body>
</html>

