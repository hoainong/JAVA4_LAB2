<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>bai2</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.3/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>

<div class="container">
 	<div class="card" style="width:400px">
 	<h5>ThÔng Tin Đăng Ký</h5>
    <img class="card-img-top" src="https://png.pngtree.com/png-vector/20190919/ourlarge/pngtree-user-login-or-authenticate-icon-on-gray-background-flat-icon-ve-png-image_1742031.jpg" alt="Card image" style="width:100%">
    <div class="card-body">
      <ul>
      	<li>Tên đăng nhập: <b>${param.username}</b></li>
      	<li>Mật Khẩu: <b>${param.password}</b></li>
      	<li>Giới Tính: <b>${param.gender}</b></li>
      	<li>Tình Trạng Hôn Nhân: <b>${param.married}</b></li>
      	<li>Quốc Tịch: <b>${param.country}</b></li>
      	<li>Ghi Chú: <b>${param.notes}</b></li>
      </ul>
    </div>
  </div>
</div>

</body>
</html>
