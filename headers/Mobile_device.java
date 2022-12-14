package headers;
public abstract class Mobile_device {
    protected String brand;
    protected String operation_system;
    protected String processor;
    protected int rom;
    protected int ram;
    protected boolean charging;
    protected boolean if_work;

    public void pour_out_the_water() {
        this.charging = false;
        this.if_work = false;
    };

    public  Mobile_device(String brand, String operation_system, String processor, int rom, int ram, boolean charging,
            boolean if_work, Boolean pour_out_the_water) {
        this.brand = brand;
        this.operation_system = operation_system;
        this.processor = processor;
        this.rom = rom;
        this.ram = ram;
        this.charging = charging;
        this.if_work = if_work;
    }

    public Mobile_device() {
        this.brand = "Apple";
        this.operation_system = "MacOS";
        this.processor = "M1 Pro";
        this.rom = 512;
        this.ram = 16;
        this.charging = true;
        this.if_work = true;
    }

    public String get_brand() {
        return this.brand;
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
        System.out.println("Ur device from " + get_brand() +" Processor is " + get_processor() + 
              " Ur OS " + get_system()  + " U have " + get_rom() + " of ROM and " + get_ram() + 
                " of RAM");
        get_charging();
        get_if_work();
    }
}