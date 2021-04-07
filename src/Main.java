public class Main{

    public static void main(String[] args) {
        Pozycja pozycja = new Pozycja("czekolada",1,2.0);
        Pozycja pozycja2 = new Pozycja("ciastko",4,4.5);
        Zamowienie z1 = new Zamowienie(20);
        z1.dodajPozycje(pozycja2);
        z1.dodajPozycje(pozycja);
       // System.out.println(z1);
        z1.usunPozycje(1);
       // System.out.println(z1);
        z1.edytujPozycje(0,"czoksy",10,15.0);
       // System.out.println(z1);
        z1.liczWartoscZRabatem(10);
        System.out.println(z1);

    }

}