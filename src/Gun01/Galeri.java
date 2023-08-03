package Gun01;

public class Galeri {
    public static void main(String[] args) {
        Araba arb = new Araba();
        arb.marka="Porsche";
        arb.model="911";

        System.out.println(arb.marka+"-"+ arb.model);

        Araba arb2 = new Araba();
        arb2.marka="Mercedes";
        arb2.model="AMG GTR";

        System.out.println(arb2.marka+"-"+arb2.model);


    }
}
