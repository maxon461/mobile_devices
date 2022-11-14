package headers;

import main.Mobile_device;

public class laptop extends Mobile_device {
    protected int amount_of_USB;
    protected String type_of_rom;
    public String type_of_keyboard;
    protected boolean cd_reader;
    protected boolean touch_screen;

    public laptop() {

        this.amount_of_USB = 1;
        this.cd_reader = true;
        type_of_rom = "HDD";
        type_of_keyboard = "Mechanical";

    }

    public laptop(String producent, String operation_system, String processor, int rom, int ram, boolean charging,
            boolean if_work, Boolean pour_out_the_water, int amount_of_USB, boolean cd_reader, String type_of_rom,
            String type_of_keyboard, boolean touch_screen) {

        super(producent, operation_system, processor, rom, ram, charging,
                if_work, pour_out_the_water);
        this.amount_of_USB = amount_of_USB;
        this.cd_reader = cd_reader;
        this.type_of_rom = type_of_rom;
        this.type_of_keyboard = type_of_keyboard;
        this.touch_screen = touch_screen;
    }

    public int get_amount_of_USB() {
        return this.amount_of_USB;
    }

    public String get_type_of_keyboard() {
        return this.type_of_keyboard;
    }

    public String get_type_of_rom() {
        return this.type_of_rom;
    }

    public void get_cd_reader() {
        if (cd_reader)
            System.out.println("CD reader is here");
        else
            System.out.println("There is no CD reader here :(");
    }

    public void get_touch_screen() {
        if (touch_screen)
            System.out.println("Touch screen is here");
        else
            System.out.println("There is no touch screen func here");
    }

    public void get_info() {
        System.out.println("Ur device from " + get_producent() + "/n"+"Processor is " + get_processor() + 
            "/n" + "Ur OS " + get_system() + "/n" + "U have " + get_rom() + " of ROM and " + get_ram() + 
                " of RAM");
        get_charging();
        get_if_work();
        
        System.out.println("Here is " + get_amount_of_USB() + " USB ports " + "and type of rom is " + get_type_of_rom()
                + " the type of keyboard is " + get_type_of_keyboard());

                get_cd_reader();
                get_touch_screen();
    }
}
