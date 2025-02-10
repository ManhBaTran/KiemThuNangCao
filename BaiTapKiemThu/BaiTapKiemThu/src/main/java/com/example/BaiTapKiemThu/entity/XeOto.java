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
public class XeOto {

    private int id;

    private String ten;

    private float gia;

    private String ghiChu;
}
