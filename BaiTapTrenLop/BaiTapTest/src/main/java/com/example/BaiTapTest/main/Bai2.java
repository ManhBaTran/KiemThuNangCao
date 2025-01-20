package com.example.BaiTapTest.main;
import com.example.BaiTapTest.service.CongThuc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Bai2 {
    CongThuc ct = new CongThuc();
    @Test
    void testChia2SoNguyen() {

        assertEquals(2, ct.testChia2SoNguyen(10, 5));
        assertEquals(3, ct.testChia2SoNguyen(15, 5));


        assertEquals(-2, ct.testChia2SoNguyen(-10, 5));
        assertEquals(-3, ct.testChia2SoNguyen(15, -5));
        assertEquals(2, ct.testChia2SoNguyen(-10, -5));


        assertEquals(0, ct.testChia2SoNguyen(0, 5));


        assertEquals(1, ct.testChia2SoNguyen(Integer.MAX_VALUE, Integer.MAX_VALUE));
        assertEquals(-1, ct.testChia2SoNguyen(Integer.MIN_VALUE, Integer.MAX_VALUE));


        assertEquals(10, ct.testChia2SoNguyen(10, 1));
        assertEquals(-10, ct.testChia2SoNguyen(10, -1));

    }
}
