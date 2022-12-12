package headers;

public abstract class Pracownik extends Osoba {
    protected int staz;
    protected String stanowisko;
    protected int pensja;

    public Pracownik() {
        this.staz = 0;
        this.stanowisko = "none";
        this.pensja = 0;
    }

    public Pracownik(String imie, String nazwisko, int pesel, int wiek, String plec, int staz, String stanowisko,
            int pensja) {
        super(imie, nazwisko, pesel, wiek, plec);
        this.staz = staz;
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    public int get_staz() {
        return staz;
    }

    public String get_stanowisko() {
        return stanowisko;
    }

    public int get_pensja() {
        return this.pensja;
    }

    public void get_info() {
        super.get_info();
        System.out.println(" staz " + this.staz +
                " stanowisko " + this.stanowisko + " pensja " + this.pensja);
    }

}