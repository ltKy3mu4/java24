package ru.mpei.lec3;

public class Table extends Thing{

    private String color;
    private String material;

    public Table(double height, double width, double length) {
        super(height, width, length);
    }

    public Table() {
    }

    public double getWoodCount(){
        return this.height * 10.2;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public double getHeight() {
        return 80;
    }

    @Override
    public double getLength() {
        return super.getLength() *0.39;
    }
}
