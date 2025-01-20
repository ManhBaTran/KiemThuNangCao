package com.example.BaiTapTest.main;

import com.example.BaiTapTest.service.CongThuc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Bai1 {
    CongThuc ct = new CongThuc();

    @Test
    void testTinhTich2SoNguyen() {

        assertEquals(20, ct.testTinhTich2SoNguyen(4, 5));
        assertEquals(100, ct.testTinhTich2SoNguyen(10, 10));


        assertEquals(0, ct.testTinhTich2SoNguyen(0, 5));
        assertEquals(0, ct.testTinhTich2SoNguyen(0, -10));


        assertEquals(15, ct.testTinhTich2SoNguyen(-3, -5));
        assertEquals(81, ct.testTinhTich2SoNguyen(-9, -9));


        assertEquals(-15, ct.testTinhTich2SoNguyen(-3, 5));
        assertEquals(-50, ct.testTinhTich2SoNguyen(10, -5));


        assertEquals(Integer.MAX_VALUE, ct.testTinhTich2SoNguyen(Integer.MAX_VALUE, 1));
        assertEquals(Integer.MIN_VALUE, ct.testTinhTich2SoNguyen(Integer.MIN_VALUE, 1));
    }
}
