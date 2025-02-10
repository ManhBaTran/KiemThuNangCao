package com.example.BaiTapKiemThu.sevice;

import com.example.BaiTapKiemThu.entity.BaiHat;

import java.util.ArrayList;
import java.util.List;

public class BaiHatSevice {
    private List<BaiHat> danhSachBaiHat = new ArrayList<>();

    public void addBaiHat(BaiHat baiHat) {
        danhSachBaiHat.add(baiHat);
    }

    public boolean removeBaiHat(String id) {
        return danhSachBaiHat.removeIf(bh -> bh.getId().equals(id));
    }

    public List<BaiHat> getAllBaiHat() {
        return danhSachBaiHat;
    }
}
