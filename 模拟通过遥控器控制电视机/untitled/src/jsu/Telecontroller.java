package jsu;

public class Telecontroller {
    private String TVModel;
    private String remoteColor;
    private int remoteDistance;
    private int batteryLife;

    public Telecontroller() {
    }

    public Telecontroller(String TVModel, String remoteColor, int remoteDistance, int batteryLife) {
        this.TVModel = TVModel;
        this.remoteColor = remoteColor;
        this.remoteDistance = remoteDistance;
        this.batteryLife = batteryLife;
    }

    // Getter 和 Setter 方法（省略）

    public void turnOnTV() {
        System.out.println("TV is turned on.");
    }

    public void turnOffTV() {
        System.out.println("TV is turned off.");
    }

    public void volumeUp() {
        System.out.println("Volume increased.");
    }

    public void changeChannelUp() {
        System.out.println("Channel changed.");
    }
}
