package headers;

import java.io.Serializable;

public abstract class Osoba implements Serializable {
    protected String imie;
    protected String nazwisko;
    protected int pesel;
    protected int wiek;
    protected String plec;

    public Osoba() {
        this.imie = "None";
        this.nazwisko = "None";
        this.pesel = 0;
        this.wiek = 0;
        this.plec = "None";
    }

    public Osoba(String imie, String nazwisko, int pesel, int wiek, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.wiek = wiek;
        this.plec = plec;

    }

    public String get_imie() {
        return imie;
    }

    public String get_nazwisko() {
        return nazwisko;
    }

    public int get_pesel() {
        return this.pesel;
    }

    public int get_wiek() {
        return wiek;
    }

    public String get_plec() {
        return this.plec;
    }

    public void get_info() {
        System.out.println("Imie osoby jest " + this.imie + " nazwisko " + this.nazwisko +
                " pesel " + this.pesel + " wiek " + this.wiek + " plec " + this.plec);
    }

}
