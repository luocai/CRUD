<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<html>
  <head>
	添加数据
  </head>
  
  <body>
    <form action="add" method = "post">
   	歌曲名称 : <input type = "text" name = "name"> 
   	所属专辑: <input type = "text" name = "album">
   	发布时间: <input type = "text" name = "time">
   	<input type = "submit" value = "提交">
    </form>
  </body>
  
<html/>
