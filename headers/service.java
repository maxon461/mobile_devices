package headers;
public class service {
    protected String name;
    protected int age;
    protected boolean experience;

    public service(){
    this.name = "Steve";
    this.age = 40;
    this.experience = true;
    }

    public service(String name , int age , boolean experience){
        this.name = name;
        this.age = age;
        this.experience = experience;
    }

    public void add_rom(Mobile_device obj , int value){
        obj.rom += value;

    }

    public void change_OS(Mobile_device obj , String OS){
        obj.operation_system = OS;

    }

    public void repair_charge(Mobile_device obj ){
        obj.charging = true;

    }

    public void repair_device(Mobile_device obj){
        obj.if_work = true;

    }

}
