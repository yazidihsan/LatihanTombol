package com.example.coder.commmerce;

import java.util.Random;

public class KumpulanFakta {
    private String[] mFakta ={
            "Yazid Ihsan adalah anak ke-4 dari 4 bersaudara",
            "Reni Puspasari telah menjalin hubungan relationship in love dengan Yazid Ihsan lebih dari 2 tahun",
            "Gunung tertinggi di Jawa Tengah adalah gunung Slamet",
            "Ridwan Kamil adalah wali kota Bandung",
            "Orang meninggal disebabkan karena hilang nyawanya",
            "Makhluk hidup butuh tempat tinggal untuk beradaptasi dengan lingkungan hayati",
            "Pemrograman tidak lah sulit apabila diiringi dengan belajar"
    };
    public String getFakta(){
        String fakta = "";
        // Memilih fakta secara acak
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFakta.length);
        fakta = mFakta[randomNumber];

        return fakta;
    }
}
