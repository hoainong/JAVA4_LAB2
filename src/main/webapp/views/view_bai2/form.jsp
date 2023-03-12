<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Thông tin cá nhân</title>
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
		<h2>Đăng Ký</h2>
		<form action="home-index" Method="post">
			<div class="form-group">
				<label>Tên Đăng Nhập: </label> <input type="text" class="form-control"
					placeholder="Nhập Tên..." name="username">
			</div>
			<div class="form-group">
				<label>Mật Khẩu: </label> <input type="password" class="form-control"
					placeholder="Nhập password..." name="password">
			</div>
			<div class="form-group">
				<label>Giới Tính:</label> 
				<input type="radio" 
					 name="gender" value="true">Nam
					 <input type="radio" 
					 name="gender" value="false">Nữ
			</div>
			<div>
				<label>Tình trạng hôn nhân:</label> 
				<input type="checkbox" name="married"> Đã có gia đình?
			</div>
			<div>
				<label>Quốc tịch:</label>
				<select name="country">
					<option value="VN">Việt Name</option>
					<option value="US">United States</option>
				</select>
			</div>
			<div>
				<label>Ghi chú:</label>
				<textarea name="notes" rows="3" cols="30"></textarea>
			</div>
			<button type="submit" class="btn btn-primary">Đăng Ký</button>
			
		</form>
	</div>

</body>
</html>