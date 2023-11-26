package oop.accessmodifier.package1;

import oop.accessmodifier.package1.KelasA;

public class Main {
    public static void main(String[] args) {
//        KelasA kelasA = new KelasA();
//        System.out.println(kelasA.memberA);
//        System.out.println(kelasA.functionA());
//        System.out.println(kelasA.functionB());

        //Jika diperhatikan, kode diatas akan terjadi eror karena memberA dan
        // functionA dalam keadaan private,
        // hal tersebut mengatikbatkan tidak bisa diakses dari luar kelas.
        KelasA kelasA = new KelasA();
        System.out.println(kelasA.functionB());

        System.out.println(kelasA.memberB);
        System.out.println(kelasA.memberC);
    }
}
