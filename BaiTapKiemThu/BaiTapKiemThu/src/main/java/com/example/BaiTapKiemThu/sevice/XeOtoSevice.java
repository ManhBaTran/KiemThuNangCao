package com.example.BaiTapKiemThu.sevice;

import com.example.BaiTapKiemThu.entity.XeOto;

import java.util.ArrayList;
import java.util.List;

public class XeOtoSevice {
    private List<XeOto> danhSachXe = new ArrayList<>();

    // Thêm xe vào danh sách
    public void addXe(XeOto xe) {
        danhSachXe.add(xe);
    }

    // Cập nhật thông tin xe theo mã
    public void updateXe(int ma, XeOto xeMoi) {
        for (XeOto xe : danhSachXe) {
            if (xe.getId() == ma) {
                xe.setTen(xeMoi.getTen());
                xe.setGia(xeMoi.getGia());
                xe.setGhiChu(xeMoi.getGhiChu());
                return;
            }
        }
    }

    // Xóa xe theo mã
    public void deleteXe(int ma) {
        danhSachXe.removeIf(xe -> xe.getId() == ma);
    }

    // Tìm kiếm xe theo mã
    public XeOto searchXe(int ma) {
        for (XeOto xe : danhSachXe) {
            if (xe.getId() == ma) {
                return xe;
            }
        }
        return null;
    }

    // Lấy danh sách tất cả xe
    public List<XeOto> getAll() {
        return danhSachXe;
    }
}
