package com.example.ktnc_01.utils;

public class lietKe {
    public int lietKeSO(int[] ints) {
        int i;
        int dem=0;
        for (i = 1; i < 100; i++){
            if (i%5 !=0){
                dem++;
            }

        }
        return dem;
    }
}
