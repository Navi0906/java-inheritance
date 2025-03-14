class Device{
    int deviceId;
    String status;

    Device(int deviceId, String status){
        this.deviceId=deviceId;
        this.status=status;
    }

    void displayStatus(){
        System.out.println(deviceId+" device's status: "+status);
    }
}

class Thermostat extends Device{
    int temperatureSetting;

    Thermostat(int deviceId, String status, int temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus(){
        System.out.println(deviceId+" device's status: "+status+ " and Setting: "+temperatureSetting);
    }
}

public class SmartHome {
    public static void main(String[] args) {
        Device gadget1 = new Thermostat(12,"Running", 32);
        Device gadget2 = new Device(13, "Idle");

        gadget1.displayStatus();
        gadget2.displayStatus();
    }
}
