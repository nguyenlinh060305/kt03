package com.example.ktnc_01.service;

import com.example.ktnc_01.model.Sach;

import java.util.List;

public class sachService {

    public static void update(List<Sach> list, Sach sach, int index){
        if (sach == null) {
            throw new IllegalArgumentException("Sach khong doc de trong");
        }
        list.set(index, sach);
    }
}
