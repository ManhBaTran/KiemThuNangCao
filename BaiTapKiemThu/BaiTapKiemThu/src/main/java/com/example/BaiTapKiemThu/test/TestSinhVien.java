package com.example.BaiTapKiemThu.test;

import com.example.BaiTapKiemThu.entity.SinhVien;
import com.example.BaiTapKiemThu.sevice.SinhVienSevice;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSinhVien {
    SinhVienSevice service;

    @BeforeEach
    public void setup() {
        service = new SinhVienSevice();
    }

    // -------------------- TEST THÊM SINH VIÊN --------------------

    @Test
    public void testAddValid() {
        SinhVien sinhVien = new SinhVien(1, "Nguyen Van A", "IT", "CNTT", "Java");
        service.addSinhVien(sinhVien);
        Assert.assertEquals(1, service.getAll().size());
    }

    @Test
    public void testAddMultipleSinhVien() {
        service.addSinhVien(new SinhVien(1, "Nguyen Van A", "IT", "CNTT", "Java"));
        service.addSinhVien(new SinhVien(2, "Tran Thi B", "IT", "CNTT", "Python"));
        Assert.assertEquals(2, service.getAll().size());
    }




    @Test
    public void testAddSinhVienWithEmptyName() {
        SinhVien sv = new SinhVien(1, "", "IT", "CNTT", "Java");
        service.addSinhVien(sv);
        Assert.assertEquals("", service.getAll().get(0).getTenSV());
    }



    @Test
    public void testUpdateValid() {
        SinhVien sinhVien = new SinhVien(1, "Nguyen Van A", "IT", "CNTT", "Java");
        service.addSinhVien(sinhVien);
        SinhVien sinhVien1 = new SinhVien(1, "Nguyen Van B", "IT", "CNTT", "Spring");
        service.updateSinhVien(sinhVien1, 1);
        Assert.assertEquals("Nguyen Van B", service.getAll().get(0).getTenSV());
    }

    @Test
    public void testUpdateNonExistingSinhVien() {
        SinhVien sinhVien1 = new SinhVien(2, "Nguyen Van C", "IT", "CNTT", "C++");
        service.updateSinhVien(sinhVien1, 2);
        Assert.assertEquals(0, service.getAll().size()); // Không có sinh viên để cập nhật
    }

    @Test
    public void testUpdateSinhVienWithNullValues() {
        SinhVien sinhVien = new SinhVien(1, "Nguyen Van A", "IT", "CNTT", "Java");
        service.addSinhVien(sinhVien);
        SinhVien svNull = new SinhVien(1, null, null, null, null);
        service.updateSinhVien(svNull, 1);
        Assert.assertNull(service.getAll().get(0).getTenSV());
    }

    @Test
    public void testUpdateMaSVNotChange() {
        SinhVien sinhVien = new SinhVien(1, "Nguyen Van A", "IT", "CNTT", "Java");
        service.addSinhVien(sinhVien);
        SinhVien sinhVien1 = new SinhVien(2, "Nguyen Van B", "IT", "CNTT", "Spring");
        service.updateSinhVien(sinhVien1, 1);
        Assert.assertEquals(1, service.getAll().get(0).getMaSV()); // MaSV không thay đổi
    }

    @Test
    public void testUpdateMultipleFields() {
        SinhVien sinhVien = new SinhVien(1, "Nguyen Van A", "IT", "CNTT", "Java");
        service.addSinhVien(sinhVien);
        SinhVien sinhVien1 = new SinhVien(1, "Nguyen Van B", "AI", "KHTN", "Python");
        service.updateSinhVien(sinhVien1, 1);
        Assert.assertEquals("Nguyen Van B", service.getAll().get(0).getTenSV());
        Assert.assertEquals("AI", service.getAll().get(0).getLop());
        Assert.assertEquals("KHTN", service.getAll().get(0).getKhoahoc());
    }



    @Test
    public void testDeleteValid() {
        SinhVien sinhVien = new SinhVien(1, "Nguyen Van A", "IT", "CNTT", "Java");
        service.addSinhVien(sinhVien);
        int sizeBefore = service.getAll().size();
        service.deleteSinhVien(1);
        int sizeAfter = service.getAll().size();
        Assert.assertEquals(sizeBefore - 1, sizeAfter);
    }

    @Test
    public void testDeleteNonExistingSinhVien() {
        service.deleteSinhVien(1);
        Assert.assertEquals(0, service.getAll().size());
    }

    @Test
    public void testDeleteAfterAddingMultipleSinhVien() {
        service.addSinhVien(new SinhVien(1, "Nguyen Van A", "IT", "CNTT", "Java"));
        service.addSinhVien(new SinhVien(2, "Tran Thi B", "IT", "CNTT", "Python"));
        service.deleteSinhVien(1);
        Assert.assertEquals(1, service.getAll().size());
    }

    @Test
    public void testDeleteAllSinhVien() {
        service.addSinhVien(new SinhVien(1, "Nguyen Van A", "IT", "CNTT", "Java"));
        service.addSinhVien(new SinhVien(2, "Tran Thi B", "IT", "CNTT", "Python"));
        service.deleteSinhVien(1);
        service.deleteSinhVien(2);
        Assert.assertEquals(0, service.getAll().size());
    }

    @Test
    public void testDeleteWithInvalidId() {
        SinhVien sinhVien = new SinhVien(1, "Nguyen Van A", "IT", "CNTT", "Java");
        service.addSinhVien(sinhVien);
        service.deleteSinhVien(2);
        Assert.assertEquals(1, service.getAll().size());
    }



    @Test
    public void testSearchSinhVienValid() {
        SinhVien sinhVien = new SinhVien(1, "Nguyen Van A", "IT", "CNTT", "Java");
        service.addSinhVien(sinhVien);
        SinhVien foundSinhVien = service.searchSinhVien(1);
        Assert.assertEquals(1, foundSinhVien.getMaSV());
    }

    @Test
    public void testSearchSinhVienInValid() {
        SinhVien sinhVien = new SinhVien(1, "Nguyen Van A", "IT", "CNTT", "Java");
        service.addSinhVien(sinhVien);
        SinhVien foundSinhVien = service.searchSinhVien(2);
        Assert.assertNull(foundSinhVien);
    }

    @Test
    public void testSearchSinhVienByDifferentId() {
        service.addSinhVien(new SinhVien(1, "Nguyen Van A", "IT", "CNTT", "Java"));
        service.addSinhVien(new SinhVien(2, "Tran Thi B", "IT", "CNTT", "Python"));
        SinhVien foundSinhVien = service.searchSinhVien(2);
        Assert.assertEquals("Tran Thi B", foundSinhVien.getTenSV());
    }
}
