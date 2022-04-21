<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 내용 보기</title>
</head>
<body>
	<h2>자유게시판 글 보기</h2>
	<hr>
	<table width="600" cellpadding="0" cellspacing="0" border="1">
		<form action="modify">
		<!-- submit 타입은 value값을 넘겨줄 수 없어서 hidden을 이용함 -->
		<input type="hidden" name="bId" value="${content_view.bId }">
			<tr>
				<td>번 호</td>
				<td>${content_view.bId }</td>
			</tr>
			<tr>
				<td>조회수</td>
				<td>${content_view.bHit }</td>
			</tr>
			<tr>
				<td>글쓴이</td>
				<td><input type="text" name="bName" size="60" value="${content_view.bName }"></td>
			</tr>
			<tr>
				<td>제 목</td>
				<td><input type="text" name="bTitle" size="60" value="${content_view.bTitle }"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">내 용</td>
			</tr>
			<tr>
				<td colspan="2"><textarea name="bContent" rows="10" cols="100">${content_view.bContent }</textarea></td>
			</tr>
			<tr>
				<td align="right" colspan="2">
					<a href="list">글 목록 보기</a>&nbsp;&nbsp;
					<a href="reply_view?bId=${content_view.bId }">답변 쓰기<a>&nbsp;&nbsp;
					<a href="delete?bId=${content_view.bId }">글 삭제<a>&nbsp;&nbsp;
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="수정"></td>
			</tr>
		</form>
	</table>
</body>
</html>