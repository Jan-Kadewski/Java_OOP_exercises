public class Pozycja {
    String nazwaTowaru;
    int ileSztuk;
    double cena;

    public Pozycja(String nazwaTowaru,int ileSztuk,double cena){
        this.nazwaTowaru = nazwaTowaru;
        this.ileSztuk = ileSztuk;
        this.cena = cena;
    }
    public Pozycja(int indeks, String nazwaTowaru) {}

    double obliczWartosc(){
        return  cena*ileSztuk;
    }
    public String toString(){
        return nazwaTowaru + " " + cena + " " + ileSztuk + " " + obliczWartosc() + "Zł" ;
    }


   public double liczWartoscZRabatem(int liczbaSztuk){
        if(liczbaSztuk >=5 && liczbaSztuk <=10){

            return obliczWartosc() *0.95;
        }
        if(liczbaSztuk >=10 && liczbaSztuk <=20){

            return obliczWartosc() *0.90;
        }
        if(liczbaSztuk >=20){

            return obliczWartosc() *0.85;
        }
        return liczWartoscZRabatem(liczbaSztuk);
    }




}
