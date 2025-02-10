package com.example.BaiTapKiemThu.sevice;

import com.example.BaiTapKiemThu.entity.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienSevice {
    private List<SinhVien> danhSachSinhVien = new ArrayList<>();

    public void addSinhVien(SinhVien sinhVien) {
        danhSachSinhVien.add(sinhVien);
    }

    public void updateSinhVien(SinhVien sinhVien, int maSV) {
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.getMaSV() == maSV) {
                sv.setTenSV(sinhVien.getTenSV());
                sv.setLop(sinhVien.getLop());
                sv.setKhoahoc(sinhVien.getKhoahoc());
                sv.setMonhoc(sinhVien.getMonhoc());
                return;
            }
        }
    }

    public void deleteSinhVien(int maSV) {
        danhSachSinhVien.removeIf(sv -> sv.getMaSV() == maSV);
    }

    public SinhVien searchSinhVien(int maSV) {
        for (SinhVien sv : danhSachSinhVien) {
            if (sv.getMaSV() == maSV) {
                return sv;
            }
        }
        return null;
    }

    public List<SinhVien> getAll() {
        return danhSachSinhVien;
    }
}
