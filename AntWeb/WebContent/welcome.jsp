<%@page import="com.multicampus.biz.user.UserDAO"%>
<%@page import="com.multicampus.biz.user.UserServiceImpl"%>
<%@page import="com.multicampus.biz.user.UserService"%>
<%@page import="com.multicampus.biz.user.UserVO"%>
<%@page contentType="text/html; charset=EUC-KR" %>

<%
	// 1. 사용자 입력정보 추출
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	// 2. DB 연동 처리
	UserVO vo = new UserVO();
	vo.setId(id);
	vo.setPassword(password);
	UserService userService = new UserServiceImpl(new UserDAO());
	UserVO user = userService.getUser(vo);
	
	// 3. 응답 화면 구성
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>임시제목</title>
</head>
<body>
<center>
<% if(user!=null) { %>
<h1><font color="orange"><%=user.getName() %></font>님 환영합니다.^^</h1>
<% } else { %>
<h1><font color="red"><%=vo.getId() %></font>님 로그인 실패ㅠㅠ</h1>
<% } %>
</center>
</body>
</html>