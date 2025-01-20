package com.example.BaiTapTest.main;
import com.example.BaiTapTest.service.CongThuc;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Bai5 {
    CongThuc ct = new CongThuc();

    String getTenNguoiDung(HoSo hoSo) {
        if (hoSo == null) {
            throw new NullPointerException("Đối tượng hồ sơ không tồn tại.");
        }
        return hoSo.getTenNguoiDung();
    }

    @Test
    void testGetTenNguoiDung() {

        HoSo hoSo = new HoSo("Nguyen Van A");
        assertEquals("Nguyen Van A", getTenNguoiDung(hoSo));


        assertThrows(NullPointerException.class, () -> getTenNguoiDung(null));


        HoSo hoSoRong = new HoSo("");
        assertEquals("", getTenNguoiDung(hoSoRong));


        HoSo hoSoDacBiet = new HoSo("@Manh123!");
        assertEquals("@Manh123!", getTenNguoiDung(hoSoDacBiet));


        String tenDai = "A".repeat(100);
        HoSo hoSoTenDai = new HoSo(tenDai);
        assertEquals(tenDai, getTenNguoiDung(hoSoTenDai));
    }
}
