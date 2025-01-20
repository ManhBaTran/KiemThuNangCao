package com.example.BaiTapTest.main;

import com.example.BaiTapTest.service.CongThuc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Bai6 {
    CongThuc ct = new CongThuc();

    @Test
    void testFindMin() {

        assertEquals(1, ct.testTimPhanTuNhoNhat(new int[]{3, 2, 1, 4, 5}));
        assertEquals(-5, ct.testTimPhanTuNhoNhat(new int[]{-1, -2, -5, 0}));

        // Trường hợp mảng rỗng
        assertThrows(IllegalArgumentException.class, () -> ct.testTimPhanTuNhoNhat(new int[]{}));
        assertThrows(IllegalArgumentException.class, () -> ct.testTimPhanTuNhoNhat(new int[]{}));
    }
}
