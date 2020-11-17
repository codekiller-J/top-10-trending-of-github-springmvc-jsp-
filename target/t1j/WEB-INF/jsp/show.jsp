<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: RainMaker
  Date: 2020/11/13
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>show</title>
</head>
<style>

</style>
<body>

<div class="items-container">
    <c:forEach var="po"   items="${requestScope.get('list')}">
        <ul class="item-container">
            <li>作者/仓库名称  <a href="http://github.com/${po.getP_name()}">${po.getP_name()}</a></li>
            <ul>
                <li>星星(分支) ${po.getP_star_branch()}</li>
                <li>仓库描述 ${po.getP_detail()}</li>
                <li>主要贡献者 ${po.getP_main_contributors()}</li>
            </ul>
        </ul>
    </c:forEach>
</div>


</body>
</html>
