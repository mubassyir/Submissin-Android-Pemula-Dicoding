package com.example.mysubmission;

import com.example.mysubmission.model.KomponenDasar;

import java.util.ArrayList;
import java.util.List;

public class All_data {

    public static List<KomponenDasar> allKomponen() {
        List<KomponenDasar> komponenDasars = new ArrayList<>();
        komponenDasars.add(new KomponenDasar("led", "LED adalah sejenis diode semikonduktor istimewa. " +
                "Seperti sebuah diode normal, LED terdiri dari sebuah chip bahan semikonduktor yang diisi penuh," +
                " atau di-dop, dengan ketidakmurnian untuk menciptakan sebuah struktur yang disebut p-n junction." +
                " Pembawa-muatan - elektron dan lubang mengalir ke junction dari elektrode dengan voltase berbeda." +
                " Ketika elektron bertemu dengan lubang, dia jatuh ke tingkat energi yang lebih rendah, dan melepas" +
                " energi dalam bentuk photon",
                R.drawable.led
        ));

        komponenDasars.add(new KomponenDasar("resistor",
                        " Resistor adalah komponen elektronika yang berfungsi untuk menghambat atau membatasi " +
                        "aliran listrik yang mengalir dalam suatu rangkain elektronika. Sebagaimana fungsi" +
                        " resistor yang sesuai namanya bersifat resistif dan termasuk salah satu komponen elektronika" +
                        " dalam kategori komponen pasif. Satuan atau nilai resistansi suatu resistor di sebut Ohm dan" +
                        " dilambangkan dengan simbol Omega (Ω). Sesuai hukum Ohm bahwa resistansi berbanding terbalik " +
                        "dengan jumlah arus yang mengalir melaluinya. Selain nilai resistansinya (Ohm) resistor juga memiliki" +
                        " nilai yang lain seperti nilai toleransi dan kapasitas daya yang mampu dilewatkannya",
                R.drawable.resistor
        ));
        komponenDasars.add(new KomponenDasar("coil",
                "Coil merupakan Sebuah kumparan elektromagnetik(transformator) yang terdiri dari" +
                        " sebuah kabel tembaga terisolasi yang solid (Kawat tembaga/email)dan inti besi yang terdiri" +
                        " atas kumparan primer dan kumparan sekunder",
                R.drawable.coil
        ));
        komponenDasars.add(new KomponenDasar("dioda",
                "Dioda adalah komponen aktif dua kutub yang pada umumnya bersifat semikonduktor, " +
                        "yang memperbolehkan arus listrik mengalir ke satu arah (kondisi panjar maju)" +
                        " dan menghambat arus dari arah sebaliknya (kondisi panjar mundur)." +
                        " Diode dapat disamakan sebagai fungsi katup di dalam bidang elektronika",
                R.drawable.dioda
        ));

        komponenDasars.add(new KomponenDasar("fuse",
                "Fuse atau dalam bahasa Indonesia disebut dengan Sekering adalah komponen yang berfungsi " +
                        "sebagai pengaman dalam Rangkaian Elektronika maupun perangkat listrik. Fuse (Sekering)" +
                        " pada dasarnya terdiri dari sebuah kawat halus pendek yang akan meleleh dan terputus jika " +
                        "dialiri oleh Arus Listrik yang berlebihan ataupun terjadinya hubungan arus pendek (short circuit)" +
                        " dalam sebuah peralatan listrik / Elektronika",
                R.drawable.fuse
        ));
        komponenDasars.add(new KomponenDasar("integrated Circuit",
                "Integrated Circuit (IC) adalah suatu komponen elektronik yang dibuat dari bahan semi conductor," +
                        " dimana IC merupakan gabungan dari beberapa komponen seperti Resistor, Kapasitor, Dioda dan Transistor " +
                        "yang telah terintegrasi menjadi sebuah rangkaian berbentuk chip kecil, IC digunakan untuk beberapa keperluan " +
                        "pembuatan peralatan elektronik agar mudah dirangkai menjadi peralatan yang berukuran relatif kecil",
                R.drawable.integrated_circuit
        ));
        komponenDasars.add(new KomponenDasar("capasitor",
                "Kapasitor adalah suatu komponen elektronika yang berfungsi untuk menyimpan arus listrik dalam bentuk " +
                        "muatan. sebuah kapasitor pada dasarnya terbuat dari dua buah lempengan logam yang saling sejajar satu sama lain " +
                        "dan diantara kedua logam tersebut terdapat bahan isolator yang sering disebut dielektrik",
                R.drawable.kapasitor
        ));

        komponenDasars.add(new KomponenDasar("switch",
                "Sakelar adalah sebuah perangkat yang digunakan untuk memutuskan jaringan listrik, atau " +
                        "untuk menghubungkannya. Jadi saklar pada dasarnya adalah alat penyambung atau pemutus aliran " +
                        "listrik. Selain untuk jaringan listrik arus kuat, saklar berbentuk kecil juga dipakai untuk " +
                        "alat komponen elektronika arus lemah",
                R.drawable.sw
        ));
        komponenDasars.add(new KomponenDasar("transformator",
                "Transfomator merupakan komponen elektronika yang dapat memindahkan energi listrik dari " +
                        "suatu rangkaian ke rangkaian lainnya. Transfomator juga berfungsi untuk merubah besarnya " +
                        "tegangan dan arus AC  menjadi tegangan dan arus DC dengan mutual induksi",
                R.drawable.transformator
        ));
        komponenDasars.add(new KomponenDasar("trasistor",
                "Pengertian Transistor dan Jenis-jenis Transistor – Transistor adalah komponen semikonduktor yang " +
                        "memiliki berbagai macam fungsi seperti sebagai penguat, pengendali, penyearah, osilator, " +
                        "modulator dan lain sebagainya. Transistor merupakan salah satu komponen semikonduktor yang " +
                        "paling banyak ditemukan dalam rangkaian-rangkaian elektronika",
                R.drawable.transistor
        ));
        return komponenDasars;
    }
}
