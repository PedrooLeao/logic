package oo.trafficlight;

public class TrafficLight {

    private String color;
    private double duration;

    public TrafficLight(String color, double duration) {
        this.color = color;
        this.duration = duration;
    }

    public void  changeColor (String newColor){
        color = newColor;
    }

    public boolean isGreen() {
        return color.equals("green");
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public boolean isRed() {
        return color.equals("Red");
    }
}
