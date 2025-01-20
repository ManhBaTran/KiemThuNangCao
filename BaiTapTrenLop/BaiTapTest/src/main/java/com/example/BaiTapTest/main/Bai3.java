package com.example.BaiTapTest.main;
import com.example.BaiTapTest.service.CongThuc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Bai3 {
    CongThuc ct = new CongThuc();
    @Test
    void testAverage() {
        assertEquals(5.0, ct.testTinhTrungBinhCong(new int[]{4, 6}), 0.001);
        assertThrows(ArithmeticException.class, () -> ct.testTinhTrungBinhCong(new int[]{}));
    }
}
