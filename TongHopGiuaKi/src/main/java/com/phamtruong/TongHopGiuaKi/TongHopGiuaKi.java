package com.phamtruong.TongHopGiuaKi;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;

@Controller
public class TongHopGiuaKi {
    ArrayList<SinhVien> dsSinhVien = new ArrayList<>(); // Khởi tạo danh sách

    public TongHopGiuaKi() {
        dsSinhVien.add(new SinhVien("Nguyen Van A", 20));
    }
}

class SinhVien {
    String ten;
    int tuoi;

    public SinhVien(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }
}