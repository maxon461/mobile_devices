package main;

import java.util.*;
import headers.*;
import java.math.*;

public class Mobile_device {
    protected String producent;
    protected String operation_system;
    protected String processor;
    protected int rom;
    protected int ram;
    protected boolean charging;
    protected boolean if_work;

    protected void pour_out_the_water() {
        this.charging = false;
        this.if_work = false;
    };

    Mobile_device(String producent, String operation_system, String processor, int rom, int ram, boolean charging,
            boolean if_work, Boolean pour_out_the_water) {
        this.producent = producent;
        this.operation_system = operation_system;
        this.processor = processor;
        this.rom = rom;
        this.ram = ram;
        this.charging = charging;
        this.if_work = if_work;
    }

    Mobile_device() {
        this.producent = "Apple";
        this.operation_system = "MacOS";
        this.processor = "M1 Pro";
        this.rom = 512;
        this.ram = 16;
        this.charging = true;
        this.if_work = true;
    }

    public String get_producent() {
        return this.producent;
    }

    public String get_system() {
        return this.operation_system;
    }

    public String get_processor() {
        return this.processor;
    }
    public int get_rom(){
        return this.rom;
    }
    public int get_ram(){
        return this.ram;
    }
    public void get_charging(){
        if(this.charging) System.out.println("Charge is OK");
        else System.out.println("Its problem with charging");
    }
    public void get_if_work(){
        if(this.if_work) System.out.println("Its works");
            else System.out.println("Its does not work");   
    }

    public void get_info(){
        System.out.println("Ur device from " + get_producent() + "/n"+"Processor is " + get_processor() + 
            "/n" + "Ur OS " + get_system() + "/n" + "U have " + get_rom() + " of ROM and " + get_ram() + 
                " of RAM");
        get_charging();
        get_if_work();
    }
    public static void main(String[] args) {
        Mobile_device macbook = new Mobile_device();
        macbook.get_info();
    }
}