package com.example.BaiTapTest.service;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CongThuc {

    //B1
    public int testTinhTich2SoNguyen(int a, int b) {
        return a * b;
    }
    //B2
    public int testChia2SoNguyen(int a, int b) {
        if (b == 0) throw new ArithmeticException("Không thể chia cho số 0");
        return a / b;
    }
    //B3
    public double testTinhTrungBinhCong(int[] numbers) {
        if (numbers.length == 0) throw new ArithmeticException("Danh sách trống");
        return (double) Arrays.stream(numbers).sum() / numbers.length;
    }
    //B4
    public int testLayPhanTu(int[] arr, int index) {
        if (index < 0 || index >= arr.length) throw new IndexOutOfBoundsException("Invalid index");
        return arr[index];
    }
    //B6
    public int testTimPhanTuNhoNhat(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Mảng không được rỗng hoặc null.");
        }

        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
