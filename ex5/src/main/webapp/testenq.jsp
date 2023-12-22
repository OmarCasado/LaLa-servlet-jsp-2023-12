<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問い合わせ</title>
</head>
<body>
	
	<h1>お問い合わせ</h1>
	<form action="testenq" method="post">
	名前：<input type="text" name="name"><br>
		<p>お問い合わせ種類</p>
		<select name="qtype">
			<option value="company">会社について</option>
			<option value="product">製品について</option>
			<option value="support">アフタ－サポ－トについて</option>
		</select><br>
		<textarea rows="10" cols="60" name= "body"></textarea><br>
		<input type="submit" value="送信">
	</form>

</body>
</html>