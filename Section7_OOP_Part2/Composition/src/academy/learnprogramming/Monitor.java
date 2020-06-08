package academy.learnprogramming;

public class Monitor {
    private String model;
    private int size;
    private String manufacturer;
    private Resolution nativeResolution;

    public Monitor(String model, int size, String manufacturer, Resolution nativeResolution) {
        this.model = model;
        this.size = size;
        this.manufacturer = manufacturer;
        this.nativeResolution = nativeResolution;
    }
    public void drawPixelAt(int x,int y,String color){
        System.out.println("Drawing pixel at "+x+","+y+" In color "+color);
    }

    public String getModel() {
        return model;
    }

    public int getSize() {
        return size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
