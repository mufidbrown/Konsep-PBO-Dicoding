package oop.accessmodifier.package2;

import oop.accessmodifier.package1.KelasA;

//KelasB merupakan kelas turunan dari kelas A
public class KelasB extends KelasA {

    @Override
    protected void methodC() {
        super.methodC();
        System.out.println("Contoh pemanggilan protected dari package luar");
    }

}
