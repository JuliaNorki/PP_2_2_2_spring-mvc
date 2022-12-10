package web.module;

public class Car { // пункт 2. Создайте модель Car с тремя произвольными полями.

    private String model;
    private String color;
    private String series;

    public Car() {}



    public Car (String model, String color, String series) {
        this.model = model;
        this.color = color;
        this.series = series;

    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getSeries() {
        return series;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", series='" + series + '\'' +
                '}';
    }
}

