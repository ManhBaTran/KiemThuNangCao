package com.example.BaiTapKiemThu.test;

import com.example.BaiTapKiemThu.entity.BaiHat;
import com.example.BaiTapKiemThu.sevice.BaiHatSevice;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestBaiHat {
    private BaiHatSevice service;

    @BeforeEach
    public void setup() {
        service = new BaiHatSevice();
    }

    // Test thêm bài hát hợp lệ
    @Test
    public void testAddBaiHatValid() {
        BaiHat baiHat = new BaiHat("1", "BaiHat1", "CaSiA", 200, "NhacSiX");
        service.addBaiHat(baiHat);
        assertEquals(1, service.getAllBaiHat().size());
    }



    // Test xóa bài hát hợp lệ
    @Test
    public void testRemoveBaiHatValid() {
        BaiHat baiHat = new BaiHat("3", "BaiHat3", "CaSiC", 180, "NhacSiZ");
        service.addBaiHat(baiHat);
        assertTrue(service.removeBaiHat("3"));
        assertEquals(0, service.getAllBaiHat().size());
    }

    // Test xóa bài hát không tồn tại
    @Test
    public void testRemoveBaiHatNotFound() {
        assertFalse(service.removeBaiHat("999"));
    }

    // Test thêm nhiều bài hát
    @Test
    public void testAddMultipleBaiHat() {
        BaiHat baiHat1 = new BaiHat("4", "BaiHat4", "CaSiD", 210, "NhacSiW");
        BaiHat baiHat2 = new BaiHat("5", "BaiHat5", "CaSiE", 220, "NhacSiV");
        service.addBaiHat(baiHat1);
        service.addBaiHat(baiHat2);
        assertEquals(2, service.getAllBaiHat().size());
    }
}
