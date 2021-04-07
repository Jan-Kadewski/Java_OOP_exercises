import java.util.ArrayList;

public class Zamowienie implements obliczWartoscZRabatem {



    int ileDodanych;
    int maksRozmiar;
    ArrayList<Pozycja> listaPozycji = new ArrayList <Pozycja>();


    public Zamowienie(int maksRozmiar){
        this.maksRozmiar = maksRozmiar;
    }

    public void dodajPozycje(Pozycja p){
//        System.out.println("Dodano do listy:" + p.toString());
          listaPozycji.add(p);
//        System.out.println("Rozmiar: " + listaPozycji.size() + "\n;Cala lista:" + listaPozycji);
          ileDodanych = listaPozycji.size();
    }

    double obliczWartosc(){
        double Total =0;
        for( int i=0;i<ileDodanych;i++){
            System.out.println(listaPozycji.get(i).cena);
        }
        return Total;
    }

    //------------------------------------------------------------------------------------------------------------------

    void usunPozycje(int indeks){

        for(int i=0;i<listaPozycji.size();i++){
            listaPozycji.remove(indeks);
        }
    }

    void edytujPozycje(int indeks,String nazwaTowaru,int ileSztuk,double cena){

        for(int i=0;i<listaPozycji.size();i++){
            // czemu tutaj nie moge zmienić nazwy towaru
            listaPozycji.get(indeks).cena = cena;
            listaPozycji.get(indeks).ileSztuk = ileSztuk;
        }
    }
    @Override
    public String toString() {
        return "Zamowienie{" +
                "ileDodanych=" + ileDodanych +
                ", maksRozmiar=" + maksRozmiar +
                ", listaPozycji=" + listaPozycji +
                '}';
    }
    @Override
    public double liczWartoscZRabatem(int iloscProduktow) {
        return liczWartoscZRabatem(iloscProduktow);
    }
}
