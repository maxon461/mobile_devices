package headers;



public class smartphone extends Mobile_device {
    protected String model;
    protected int main_camera_resolution;
    protected boolean dual_sim;
    protected boolean apple_pay;

    public smartphone() {
        super("14 pro" , "iOS" , "Apple silicon" , 512 , 6 , true , true , 
        false );
        this.model = "iPhone";
        this.dual_sim = false;
        this.apple_pay = true;
        this.main_camera_resolution = 12;
    }

    public smartphone(String brand, String operation_system, String processor, int rom, int ram, boolean charging,
            boolean if_work, Boolean pour_out_the_water, String model, int main_camera_resolution, boolean dual_sim,
            boolean apple_pay) {
        super(brand, operation_system, processor, rom, ram, charging, if_work, pour_out_the_water);
        this.model = model;
        this.dual_sim = dual_sim;
        this.apple_pay = apple_pay;
        this.main_camera_resolution = main_camera_resolution;
    }

    public String get_model() {
        return this.model;
    }

    public int get_main_camera_resolution() {
        return this.main_camera_resolution;
    }

    public void get_dual_sim() {
        if (this.dual_sim)
            System.out.println("You have dual sim");
        else
            System.out.println("You don't have dual sim");
    }

    public void get_apple_pay() {
        if (this.apple_pay)
            System.out.println("You can pay using Apple Pay");
        else
            System.out.println("Sorry, you can't pay using Apple Pay");
    }

    public void get_info(){
        super.get_info();
        System.out.println("Your phone model is " + this.model + " and your main camera resolution is " 
                            + this.main_camera_resolution);  
        get_apple_pay();
        get_dual_sim();
    }
}
