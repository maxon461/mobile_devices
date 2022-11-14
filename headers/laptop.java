package headers;

import main.Mobile_device;

public class laptop extends Mobile_device {
    protected int amount_of_USB;
    protected boolean cd_reader;
    protected String type_of_rom;
    public String type_of_keyboard;
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

}
