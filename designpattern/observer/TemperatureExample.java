package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(double temperature);
}

class TemperatureSensor {
    private List<Observer> observers = new ArrayList<>();
    private double temperature;


    public TemperatureSensor(){};
    

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver (Observer observer) {
        observers.remove(observer);
    }

    public void setTemperature (double temperature){
        this.temperature = temperature;
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

class TemperatureDisplay implements Observer {
    private String name;

    public TemperatureDisplay(String name){
        this.name = name;
    }

    public void update (double temperature) {
        System.out.println(name + ": New temperature received - "+ temperature + " °C");
    }

}

public class TemperatureExample {

    public static void main(String[] args) {
        TemperatureSensor sensor = new TemperatureSensor();

        TemperatureDisplay display1 = new TemperatureDisplay("Display 1");
        TemperatureDisplay display2 = new TemperatureDisplay("Display 2");
        
        sensor.addObserver(display1);
        sensor.addObserver(display2);

        sensor.setTemperature(25.5);

        sensor.removeObserver(display2);

        sensor.setTemperature(30.2);

    }

    
    
}
