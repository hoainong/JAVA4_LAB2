<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Thông Tin tam giác</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>Thông tin hình Tam Giác</h2>
		<form action="home" Method="post">
			<div class="form-group">
				<label>Cạnh A:</label> <input type="text" class="form-control"
					placeholder="Nhập Cạnh A" name="A">
			</div>
			<div class="form-group">
				<label>Cạnh B:</label> <input type="text" class="form-control"
					placeholder="Nhập Cạnh B" name="B">
			</div>
			<div class="form-group">
				<label>Cạnh C:</label> <input type="text" class="form-control"
					placeholder="Nhập Cạnh C" name="C">
			</div>
			<button type="submit" class="btn btn-primary">Tính Chu Vi</button>
			<button type="submit" class="btn btn-primary mr-2 ml-2" name="dientich" value="dien-tich">Tính
				Diện Tích</button>
				
		</form>
	</div>

</body>
</html>