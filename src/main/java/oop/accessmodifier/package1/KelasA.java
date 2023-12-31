package oop.accessmodifier.package1;

public class KelasA {

    //Access Modifier Private
    private int memberA = 5;
    //Access Modifier Default
    char memberB = 'A';
    //Access Modifier Default
    double memberC = 1.5;
    private int functionA() {
        return memberA;
    }
    int functionB() {
        // Pemanggilan private member dan private function
        int hasil = functionA() + memberA;
        return hasil;
    }

    //Access Modifier Protected
    protected void methodC(){
        System.out.println("Percobaan access modifier!!!");
    }
}
