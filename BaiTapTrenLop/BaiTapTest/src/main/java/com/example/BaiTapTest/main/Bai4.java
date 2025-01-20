package com.example.BaiTapTest.main;
import com.example.BaiTapTest.service.CongThuc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Bai4 {
    CongThuc ct = new CongThuc();
    @Test
    void testLayPhanTu() {
        int[] arr = {10, 20, 30};
        assertEquals(20, ct.testLayPhanTu(arr, 1));
        assertThrows(IndexOutOfBoundsException.class, () -> ct.testLayPhanTu(arr, 5));
    }
}
