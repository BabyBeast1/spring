<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table{
	border-collapse: collapse;
}
th, td{
	padding: 5px;
}

#currentPaging {
	border: 1px solid #ccc;
	margin: 5px;
	padding: 5px 8px;
	color: red;
	cursor: pointer;
}
#paging {
	color: black;
	margin: 5px;
	padding: 5px;
	cursor: pointer;
}
.subjectA:link {color: black; text-decoration: none;}
.subjectA:visited {color: black; text-decoration: none;}
.subjectA:hover {color: red; text-decoration: underline;}
.subjectA:active {color: black; text-decoration: none;}
</style>
</head>
<body>

<input type="hidden" id="pg" value="${pg }">

<table border="1" frame="hsides" rules="rows" id="userListTable">
	<tr>
		<th width="200">이름</th>
		<th width="200">아이디</th>
		<th width="200">비밀번호</th>
	</tr>
	
	<!-- 동적 처리 -->
	
</table>
<div id="userPagingDiv" style="width: 630px; text-align: center; margin-top: 10px;"></div>

<script src="http://code.jquery.com/jquery-3.7.0.min.js"></script>
<script type="text/javascript" src="../js/list.js"></script>
<script type="text/javascript">
function userPaging(pg){
	location.href = "/chapter06_web/user/list?pg=" + pg;
}
</script>

</body>
</html>