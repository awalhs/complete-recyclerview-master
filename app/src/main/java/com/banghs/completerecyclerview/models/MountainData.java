package com.banghs.completerecyclerview.models;

import java.util.ArrayList;

public class MountainData {

    // array to store data that will be displayed on RecyclerView
    public static String[][] data = new String[][] {
            // copy from my gits, link in description
            // this data from wikipedia
            {"Sistem Komputer",
                    "Akreditasi B",
                    "https://upload.wikimedia.org/wikipedia/commons/2/21/Akreditasi-B.png",
                    " Program Studi Sistem Komputer \n"+
                    " Fakultas Sains & Teknologi"},
            {"Teknik Komputer",
                    "Akreditasi B",
                    "https://upload.wikimedia.org/wikipedia/commons/2/21/Akreditasi-B.png",
                    " Program Studi Teknik Komputer \n"+
                    " Fakultas Sains & Teknologi"},
            {"Teknik Elektro",
                    "Akreditasi B)",
                    "https://upload.wikimedia.org/wikipedia/commons/2/21/Akreditasi-B.png",
                    " Program Studi Teknik Elektro \n"+
                     " Fakultas Sains & Teknologi"},
            {"Teknik Arsitektur",
                    "Akreditasi B",
                    "https://upload.wikimedia.org/wikipedia/commons/2/21/Akreditasi-B.png",
                    " Program Studi Teknik Arsitektur \n"+
                    " Fakultas Sains & Teknologi"},
            {"Agroteknologi",
                    "Akreditasi B",
                    "https://upload.wikimedia.org/wikipedia/commons/2/21/Akreditasi-B.png",
                    " Program Studi Agroteknologi\n"+
                    " Fakultas Sains & Teknologi"},
            {"Peternakan",
                    "Akreditasi B",
                    "https://upload.wikimedia.org/wikipedia/commons/2/21/Akreditasi-B.png",
                    " Program Studi Peternakan \n"+
                    " Fakultas Sains & Teknologi"},
            {"Ilmu Hukum",
                    "Akreditasi B",
                    "https://upload.wikimedia.org/wikipedia/commons/2/21/Akreditasi-B.png",
                    " Program Studi Ilmu Hukum \n"+
                    " Fakultas Sosial Sains"},
            {"Manajemen",
                    "Akreditasi B",
                    "https://upload.wikimedia.org/wikipedia/commons/2/21/Akreditasi-B.png",
                    " Program Studi Manajemen \n"+
                    " Fakultas Sosial Sains"},
            {"Akuntansi",
                    "Akreditasi A",
                    "https://upload.wikimedia.org/wikipedia/commons/6/6e/Akreditasi-A.png",
                    " Program Studi Akuntansi \n"+
                            " Fakultas Sosial Sains"},
            {"Ekonomi Pembangunan",
                    "Akreditasi A",
                    "https://upload.wikimedia.org/wikipedia/commons/6/6e/Akreditasi-A.png",
                    " Program Studi Ekonomi Pembangunan \n"+
                    " Fakultas Sosial Sains"},
            {"Perpajakan",
                    "Akreditasi B",
                    "https://upload.wikimedia.org/wikipedia/commons/2/21/Akreditasi-B.png",
                    " Program Studi Perpajakan \n"+
                    " Fakultas Sosial Sains"},
            {"Ilmu Filsafat",
                    "Akreditasi B",
                    "https://upload.wikimedia.org/wikipedia/commons/2/21/Akreditasi-B.png",
                    " Program Studi Ilmu Filsafat \n"+
                    " Fakultas Agama Islam & Humaniora"},
            {"Pendidikan Agama Islam",
                    "Akreditasi B",
                    "https://upload.wikimedia.org/wikipedia/commons/2/21/Akreditasi-B.png",
                    " Program Studi Pendidikan Agama Islam \n"+
                    " Fakultas Agama Islam & Humaniora"},
            {"Pendidikan Islam Anak Usia Dini",
                    "Akreditasi B",
                    "https://upload.wikimedia.org/wikipedia/commons/2/21/Akreditasi-B.png",
                    " Program Studi Pendidikan Islam Anak Usia Dini \n"+
                    " Fakultas Agama Islam & Humaniora"}
    };

    public static ArrayList<Mountain> getListData() {
        Mountain mountain;
        ArrayList<Mountain> list = new ArrayList<>();

        for (String[] mData : data) {
            mountain = new Mountain();
            mountain.setName(mData[0]);
            mountain.setElevation(mData[1]);
            mountain.setPhoto(mData[2]);
            mountain.setDescription(mData[3]);
            list.add(mountain);
        }

        return list;
    }

}
