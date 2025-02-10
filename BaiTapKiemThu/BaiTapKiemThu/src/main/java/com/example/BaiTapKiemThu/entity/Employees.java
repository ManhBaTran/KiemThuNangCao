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
public class Employees {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

}
