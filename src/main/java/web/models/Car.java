package web.models;

public class Car {
    private int series;
    private int year;
    private String model;

    public Car(int series, int year, String model) {
        this.series = series;
        this.year = year;
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
