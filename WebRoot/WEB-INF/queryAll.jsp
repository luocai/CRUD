<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
  <body>
    <table border="2" align = "center">
	    <tr>
	    	<td>id</td>
	    	<td>曲名</td>
	    	<td>专辑</td>
	    	<td>时间</td>
	    	<td>操作</td>
	    	<td>操作</td>
	    </tr>
	    <c:forEach items="${list }" var = "l">
	    <tr>
	    	<td>${l.id }</td>
	    	<td>${l.name }</td>
	    	<td>${l.album }</td>
	    	<td>${l.time }</td>
	    	<td> <a href = "delete?id=${l.id }">删除</a>
	    	<td> <a href = "toEdit?id=${l.id }">编辑</a>  <!-- 我的天哪!!!引号内不可以有空格!!! --> 
	    </tr>
	    </c:forEach>
    </table>
    
    <br/>
    <br/>
    
    
    <div align = "center">
    <a href = "toAdd">增加歌曲</a> <br/>
    </div>
  </body>
</html>
