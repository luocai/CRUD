<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<html>
  <body>
  <div algin = "center">
    <form action="edit" method = post>
    	<input type = "hidden" name = "id" value = "${song.id }"/>
    	歌曲名称:<input type = "text" name = "name" value = "${song.name }">
    	所属专辑:<input type = "text" name = "album" value = "${song.album }">
    	发布时间:<input type = "text" name = "time" value = "${song.time }"> <br/>
    	<input type = "submit" value = "更新">
    </form>
   </div>
  </body>
</html>
