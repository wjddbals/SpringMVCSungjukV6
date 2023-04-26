
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>성적조회결과</title>
</head>
<body>
<h1>성적조회</h1>

<ul>
  <li>${sj.sjno}</li>
  <li>${sj.name}</li>
  <li>${sj.kor}</li>
  <li>${sj.eng}</li>
  <li>${sj.mat}</li>
  <li>${sj.tot}</li>
  <li>${sj.avg}</li>
  <li>${sj.grd}</li>
  <li>${sj.regdate}</li>
</ul>

<p><a href="/modify?sjno=${sj.sjno}">수정하기</a></p>
<p><a href="/remove?sjno=${sj.sjno}">삭제하기</a></p>
</body>
</html>
