# 🩸 Blood Donation Management System

Hệ thống quản lý hiến máu toàn diện giúp kết nối người hiến máu, người cần máu và các cơ sở y tế một cách hiệu quả và an toàn.

## 📋 Mục Lục

- [Giới Thiệu](#giới-thiệu)
- [Tính Năng Chính](#tính-năng-chính)
- [Kiến Trúc Hệ Thống](#kiến-trúc-hệ-thống)
- [Cơ Sở Dữ Liệu](#cơ-sở-dữ-liệu)
- [Cài Đặt](#cài-đặt)
- [Sử Dụng](#sử-dụng)
- [API Documentation](#api-documentation)
- [Đóng Góp](#đóng-góp)
- [Giấy Phép](#giấy-phép)

## 🎯 Giới Thiệu

Blood Donation Management System là một nền tảng web hiện đại được thiết kế để:

- **Kết nối** người hiến máu với người cần máu
- **Quản lý** quy trình hiến máu từ đăng ký đến hoàn thành
- **Theo dõi** kho máu và tồn kho tại các bệnh viện
- **Tối ưu hóa** việc phân phối máu dựa trên vị trí địa lý
- **Đảm bảo** an toàn và chất lượng máu hiến

## ✨ Tính Năng Chính

### 🔐 Quản Lý Người Dùng
- **Đăng ký/Đăng nhập** với xác thực email/SMS
- **Phân quyền** đa cấp (Guest, Donor, Recipient, Staff, Admin)
- **Hồ sơ cá nhân** với thông tin y tế chi tiết
- **Quản lý session** và bảo mật

### 🩸 Quản Lý Nhóm Máu
- **Chuẩn hóa** 8 nhóm máu ABO/Rh
- **Ma trận tương thích** máu chi tiết
- **Thành phần máu** (Whole Blood, RBC, Plasma, Platelets)
- **Universal donor/recipient** identification

### 📅 Lịch Hẹn Hiến Máu
- **Đặt lịch** hiến máu linh hoạt
- **Xác nhận** và nhắc nhở tự động
- **Quản lý** time slots và địa điểm
- **Hủy/Dời lịch** với lý do

### 🏥 Quy Trình Y Tế
- **Kiểm tra sức khỏe** trước hiến máu
- **Quy trình hiến máu** được theo dõi chi tiết
- **Xét nghiệm máu** và đảm bảo chất lượng
- **Lưu trữ** kết quả và lịch sử

### 📦 Quản Lý Kho Máu
- **Theo dõi** tồn kho theo thời gian thực
- **Quản lý** hạn sử dụng và điều kiện bảo quản
- **Giao dịch** nhập/xuất kho tự động
- **Báo cáo** tình trạng kho máu

### 🚨 Yêu Cầu Máu Khẩn Cấp
- **Đăng ký** yêu cầu máu với mức độ ưu tiên
- **Matching** tự động với người hiến phù hợp
- **Thông báo** khẩn cấp đến donors gần nhất
- **Theo dõi** trạng thái yêu cầu

### 🗺️ Tìm Kiếm Địa Lý
- **Tìm kiếm** donors/recipients theo vị trí
- **Bản đồ** hiển thị các điểm hiến máu
- **Tính toán** khoảng cách và thời gian di chuyển
- **Tối ưu** route cho emergency cases

### 🔔 Hệ Thống Thông Báo
- **Email/SMS** notifications
- **Push notifications** cho mobile app
- **Nhắc nhở** lịch hẹn và eligibility
- **Cập nhật** trạng thái real-time

### 📊 Báo Cáo & Thống Kê
- **Dashboard** tổng quan hệ thống
- **Báo cáo** hiến máu theo thời gian
- **Thống kê** nhóm máu và khu vực
- **Phân tích** hiệu quả hoạt động

## 🏗️ Kiến Trúc Hệ Thống


