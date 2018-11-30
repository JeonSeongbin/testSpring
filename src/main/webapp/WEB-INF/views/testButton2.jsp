<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<script>
function formSubmit(){
	
//	document.testForm.method="POST"
//	document.testForm.action="/test3/testForm123";
//	document.testForm.submit();
	window.open("/test3/testForm123","name");

}
</script>
<body>
<form action="/test3/testButton3" method="get" name="testForm">
testButton2 Page<br>
go to 
testButton3 <input type="text" name="testButton3" value="testButton3333333"/>
ida <input type="text" name="ida" value="idaValue"/>
<input type="submit" value="${testValue}" />
<a href="javascript:formSubmit()"><input type="button" value="new User" /></a>
</form>
</body>
</html>