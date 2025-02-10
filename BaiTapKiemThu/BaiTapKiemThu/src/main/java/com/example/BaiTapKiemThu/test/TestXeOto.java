package com.example.BaiTapKiemThu.test;

import com.example.BaiTapKiemThu.entity.XeOto;
import com.example.BaiTapKiemThu.sevice.XeOtoSevice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestXeOto {

    XeOtoSevice service;

    @Before
    public void setup() {
        service = new XeOtoSevice();
    }

    @Test
    public void testAddValid() {
        XeOto xe = new XeOto(1, "MayBack", 1000f, "Khong");
        service.addXe(xe);
        Assert.assertEquals(1, service.getAll().size());
    }

    @Test
    public void updateValid() {
        XeOto xe = new XeOto(1, "MayBack", 1000f, "Khong");
        service.addXe(xe);
        XeOto xe1 = new XeOto(1, "MayBack", 1000000f, "Khong");
        service.updateXe(1, xe1);
        Assert.assertEquals(1000000f, service.getAll().get(0).getGia(), 0.001);
    }

    @Test
    public void deleteValid() {
        XeOto xe = new XeOto(1, "MayBack", 1000f, "Khong");
        service.addXe(xe);
        int sizeBefore = service.getAll().size();
        service.deleteXe(1);
        int sizeAfter = service.getAll().size();
        Assert.assertEquals(sizeBefore - 1, sizeAfter);
    }

    @Test
    public void deleteInValid() {
        XeOto xe = new XeOto(1, "MayBack", 1000f, "Khong");
        service.addXe(xe);
        int sizeBefore = service.getAll().size();
        service.deleteXe(2); // Xóa xe không tồn tại
        int sizeAfter = service.getAll().size();
        Assert.assertEquals(sizeBefore, sizeAfter);
    }

    @Test
    public void testSearchXeOtoValid() {
        XeOto xe = new XeOto(1, "MayBack", 1000f, "Khong");
        service.addXe(xe);

        XeOto foundXeOTO = service.searchXe(1);

        Assert.assertEquals(1, foundXeOTO.getId());
    }

    @Test
    public void testSearchXeOtoInValid() {
        XeOto xe = new XeOto(1, "MayBack", 1000f, "Khong");
        service.addXe(xe);

        XeOto foundXeOTO = service.searchXe(2); // ID không tồn tại

        Assert.assertNull(foundXeOTO);
    }
}
