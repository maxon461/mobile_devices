package headers;

import java.util.*;

public class displays {
    public ArrayList<Osoba> osoba = new ArrayList<Osoba>();
    public ArrayList<Kurs> kursy = new ArrayList<Kurs>();
    public praca_z_plikiem plik = new praca_z_plikiem();

    public void szukaj_osobe() {
        Obsluga steve = new Obsluga();
        System.out.println("Wybeirz opcje");
        System.out.println("1. Studenta");
        System.out.println("2. Prac_adm");
        System.out.println("3. Prac_badaw_dyd");
        System.out.println("4. Kursy");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        switch (num) {
            case 1:
                steve.wyswetl_studenta(osoba);
                menu();
                break;
            case 2:
                steve.wyswetl_prac_adm(osoba);
                menu();

                break;
            case 3:
                steve.wyswetl_prac_dyd(osoba);
                menu();
                break;
            case 4:
                steve.wyswetl_kursy(kursy);
                menu();

                break;

            default:
                System.out.println("nie ma takiej opcja , masz menu");
                menu();
                break;
        }
    }

    public void szukaj() {
        System.out.println("Wybierz opcje :");
        System.out.println("1.Szukaj pracownika po imieniu");
        System.out.println("2.Szukaj pracownika po nazwisku");
        System.out.println("3.Szukaj pracownika po stanowisku");
        System.out.println("4.Szukaj pracownika po stazu");
        System.out.println("5.Szukaj pracownika po pensji");
        System.out.println("6.Szukaj pracownika adm po liczbie nadgodzin");
        System.out.println("7.Szukaj studenta po imieniu");
        System.out.println("8.Szukaj studenta po nazwisku");
        System.out.println("9.Szukaj studenta po indeksie");
        System.out.println("10.Szukaj studenta po roku studiow");
        System.out.println("11.Szukaj studenta po kursie");
        System.out.println("12.Szukaj kurs po nazwie");
        System.err.println("13.Szukaj kurs po prowadzacym");
        System.out.println("14.Szukaj kurs po ECTS");

        Obsluga steve = new Obsluga();

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        switch (num) {
            case 1:
                System.out.println("Wpisz imie ");
                String imie = sc.nextLine();
                steve.szukaj_prac_za_imie(osoba, imie);
                break;
            case 2:
                System.out.println("Wpisz nazwisko ");
                String nazwisko = sc.nextLine();
                steve.szukaj_prac_za_nazwisko(osoba, nazwisko);
                break;
            case 3:
                System.out.println("Wpisz stanowisko ");
                String stanowisko = sc.nextLine();
                steve.szukaj_prac_za_stanowisko(osoba, stanowisko);
                break;
            case 4:
                System.out.println("Wpisz staz ");
                int staz = sc.nextInt();
                steve.szukaj_prac_za_staz(osoba, staz);
                break;
            case 5:
                System.out.println("Wpisz pensje ");
                int pensja = sc.nextInt();
                steve.szukaj_prac_za_pensja(osoba, pensja);
                break;
            case 6:
                System.out.println("Wpisz liczbe nadgodzin pracowniku adm");
                int liczba_nadgodzin = sc.nextInt();
                steve.szukaj_prac_za_licz_nadgodzin(osoba, liczba_nadgodzin);
                break;
            case 7:
                System.out.println("Wpisz imie ");
                String imie_stud = sc.nextLine();
                steve.szukaj_stud_za_imie(osoba, imie_stud);
                break;
            case 8:
                System.out.println("Wpisz nazwisko ");
                String nazwisko_stud = sc.nextLine();
                steve.szukaj_stud_za_nazwisko(osoba, nazwisko_stud);
                break;
            case 9:
                System.out.println("Wpisz indeks ");
                String indeks_stud = sc.nextLine();
                steve.szukaj_stud_za_indeks(osoba, indeks_stud);
                break;

            case 10:
                System.out.println("Wpisz rok studiow");
                int rok_studiow = sc.nextInt();
                steve.szukaj_stud_za_rok_studiow(osoba, rok_studiow);
                break;
            case 11:
                System.out.println("Wpisz nazwe kursu");
                String nazwa_kursu = sc.nextLine();
                steve.szukaj_stud_za_kurs(osoba, nazwa_kursu);
                break;
            case 12:
                System.out.println("Wpisz nazwa ");
                String nazwa = sc.nextLine();
                steve.szukaj_kursy_nazwa(kursy, nazwa);
                break;
            case 13:

                System.out.println("Wpisz prowadzacego ");
                String prowadzacy = sc.nextLine();
                steve.szukaj_kursy_prowadzacy(kursy, prowadzacy);
                break;
            case 14:
                System.out.println("Wpisz ECTS ");
                int ECTS = sc.nextInt();
                steve.szukaj_kursy_ECTS(kursy, ECTS);
                break;

            default:
                System.out.println("Wybirz poprawna opcje ");
                szukaj();
                break;
        }

        menu();

    }

    public void stworz_studenta() {

        System.out.println("wpisz dane studenta()");
        Scanner sc = new Scanner(System.in);
        System.out.println("Imie:");
        String imie = sc.nextLine();
        System.out.println("Nazwisko");
        String nazwisko = sc.nextLine();
        System.out.println("pesel");
        int pesel = sc.nextInt();
        System.out.println("wiek");
        int wiek = sc.nextInt();
        sc.nextLine();
        System.out.println("plec");
        String plec = sc.nextLine();
        System.out.println("nr_indeksu");
        String indeks = sc.nextLine();
        System.out.println("rok_studiow");
        int rok = sc.nextInt();
        System.out.println("erasmus??");
        System.out.println("true. Tak");
        System.out.println("false. Nie");
        boolean erasmus = sc.nextBoolean();
        System.out.println("pierwszy stopien?");
        System.out.println("true. Tak");
        System.out.println("false.  Nie");
        boolean pierwszy_stopien = sc.nextBoolean();
        System.out.println("drugi stopien?");
        System.out.println("true. Tak");
        System.out.println("false.  Nie");
        boolean drugi_stopien = sc.nextBoolean();
        System.out.println("stacjonarne??");
        System.out.println("true. Tak");
        System.out.println("false.  Nie");
        boolean stacjonarne = sc.nextBoolean();

        ArrayList<Kurs> kursy_studenta = new ArrayList<Kurs>();
        System.out.println("Dodajemy kursy , ile ich ma byc?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("nazwa");
            String str = sc.nextLine();

            System.out.println("prowadzacy");
            String prowadzacy = sc.nextLine();

            System.out.println("ECTS");
            int ECTS = sc.nextInt();

            kursy_studenta.add(new Kurs(str, prowadzacy, ECTS));

        }

        osoba.add(
                new Student(imie, nazwisko, pesel, wiek, plec, indeks, rok, erasmus, pierwszy_stopien, drugi_stopien,
                        stacjonarne, kursy_studenta));

        System.out.println("Zrobione!!!");
        menu();

    }

    public void stworz_prac_dyd() {
        System.out.println("wpisz dane prac_dyd");
        Scanner sc = new Scanner(System.in);
        System.out.println("Imie:");
        String imie = sc.nextLine();
        System.out.println("Nazwisko");
        String nazwisko = sc.nextLine();
        System.out.println("pesel");
        int pesel = sc.nextInt();
        System.out.println("wiek");
        int wiek = sc.nextInt();
        sc.nextLine();
        System.out.println("plec");
        String plec = sc.nextLine();
        System.out.println("staz");
        int staz = sc.nextInt();
        sc.nextLine();
        System.out.println("stanowisko");
        String stanowisko = sc.nextLine();
        System.out.println("pensja");
        int pensja = sc.nextInt();
        sc.nextLine();
        System.out.println("liczba_punktuacji");
        int liczba_publikacji = sc.nextInt();

        osoba.add(new Pracownik_badawczo_dyd(imie, nazwisko, pesel, wiek, plec, staz, stanowisko, pensja,
                liczba_publikacji));

        System.out.println("Zrobione");
        menu();

    }

    public void stworz_prac_adm() {
        System.out.println("wpisz dane prac_dyd");
        Scanner sc = new Scanner(System.in);
        System.out.println("Imie:");
        String imie = sc.nextLine();
        System.out.println("Nazwisko");
        String nazwisko = sc.nextLine();
        System.out.println("pesel");
        int pesel = sc.nextInt();
        System.out.println("wiek");
        int wiek = sc.nextInt();
        sc.nextLine();
        System.out.println("plec");
        String plec = sc.nextLine();
        System.out.println("staz");
        int staz = sc.nextInt();
        sc.nextLine();
        System.out.println("stanowisko");
        String stanowisko = sc.nextLine();
        System.out.println("pensja");
        int pensja = sc.nextInt();
        sc.nextLine();
        System.out.println("liczba_punktuacji");
        int liczba_nadgodzin = sc.nextInt();

        osoba.add(new Pracownik_administracyjny(imie, nazwisko, pesel, wiek, plec, staz, stanowisko, pensja,
                liczba_nadgodzin));

        System.out.println("Zrobione");
        menu();

    }

    public void wybierz_osobe() {
        System.out.println("Wybierz jaka osobe trzeba stworzyc");
        System.out.println("1. Student");
        System.out.println("2. Pracownik dyd");
        System.out.println("3. Pracownik adm");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                stworz_studenta();
                break;
            case 2:
                stworz_prac_dyd();
                break;
            case 3:
                stworz_prac_adm();
                break;
            default:
                System.out.println("Nie ma takiej opcji ------------------------------");
                wybierz_osobe();
                break;
        }

    }

    public void stworz_kurs() {
        System.out.println("Tworzymy kursy");
        Scanner sc = new Scanner(System.in);
        System.out.println("nazwa");
        String nazwa = sc.nextLine();
        System.out.println("prowadzacy");
        String prowadzacy = sc.nextLine();
        System.out.println("ECTS");

        int ECTS = sc.nextInt();

        kursy.add(new Kurs(nazwa, prowadzacy, ECTS));

        System.out.println("Zrobione!!");

        menu();

    }

    public void menu() {
        System.out.println("Menu glowne");
        System.out.println("1. dodaj Osoba");
        System.out.println("2. dodaj Kurs");
        System.out.println("3. Wyswetl");
        System.out.println("4. Znajdz");
        System.out.println("5. Odczytaj dane osob z pliku");
        System.out.println("6. Zapisz wszystkie dane osob do pliku");
        System.out.println("7. Dodaj dane osob z pliku do arraylisty osob");

        System.out.println("Jak wszystkich masz to 0");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                wybierz_osobe();
                break;
            case 2:
                stworz_kurs();
                break;
            case 3:
                szukaj_osobe();
                break;
            case 4:
                szukaj();
                break;
            case 5:
                plik.wyswetl_z_pliku(osoba);
                menu();
                break;
            case 6:
                plik.zapisz_dane(osoba);
                menu();
                break;
            case 7:
                plik.dodaj_osob_z_pliku(osoba);
                menu();
                break;

            case 0:
                break;
            default:
                System.out.println("Nie ma takiej opcji , prosze powtorzyc --------------");
                menu();

        }
    }

}
