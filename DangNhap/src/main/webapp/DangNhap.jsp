<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dang Nhap</title>
</head>
<body>
<%
    String username = request.getParameter("tenDangNhap");
    String password = request.getParameter("matkhau");

    if ("Truong".equals(username) && "123".equals(password)) {
        response.sendRedirect("UserProfile.htm");
    } else {
        out.println("<h2>Login Failed</h2>");
        out.println("<a href='DangNhap.html'>Try Again</a>");
    }
%>
</body>
</html>