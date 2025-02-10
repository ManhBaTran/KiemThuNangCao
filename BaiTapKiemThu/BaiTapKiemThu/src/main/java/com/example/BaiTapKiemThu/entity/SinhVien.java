package com.example.BaiTapKiemThu.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SinhVien {
    private int maSV;
    private String tenSV;
    private String lop;
    private String khoahoc;
    private String monhoc;
}
