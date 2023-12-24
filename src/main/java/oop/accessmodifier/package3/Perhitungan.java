package oop.accessmodifier.package3;

public class Perhitungan {

    public static int nilai = 0;

    //ini tambahan
    protected static int getNilai(){
        return nilai;
    }

    Perhitungan() {
        nilai++;
    }
}
