package main;
import headers.*;



public abstract class main {
    
    public static void main(String[] args) {
        laptop lenovo = new laptop("lenovo" , "windows" , "intel core i5" , 512 , 6 , true , false , 
        false , 2 , true , "SSD" , "Mechanical" , false);
        lenovo.get_info();
        service steve = new service();
        steve.add_rom(lenovo, 100);
        lenovo.get_info();
        lenovo.pour_out_the_water();
        lenovo.get_info();
        steve.repair_charge(lenovo);
        steve.repair_device(lenovo);
        lenovo.get_info();
    }
}