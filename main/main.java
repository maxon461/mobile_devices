package main;
import headers.*;



public abstract class main {
    
    public static void main(String[] args) {
        laptop lenovo = new laptop("lenovo" , "windows" , "intel core i5" , 512 , 6 , true , false , 
        false , 2 , true , "SSD" , "Mechanical" , false);
        lenovo.get_info();
        smartphone iphone = new smartphone();
        iphone.get_info();

    }
}