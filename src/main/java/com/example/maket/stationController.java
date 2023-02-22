package com.example.maket;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class stationController {

    private State state;
    private Control control;
    private int trainCounter = 0;
    private String nameOfStation;

    public stationController(State state, Control control, int trainCounter) {
        this.state = state;
        this.control = control;
        this.trainCounter = trainCounter;


    }
}
@Getter
enum State{
    WAITING("Ожидание"),
    SORTING("Сортировка"),
    LEAVING("Отбытие");

    private final String displayValue;
    State(String state) {
        this.displayValue = state;
    }
}
@Getter
enum Control {
    FIELD("Управление по месту"),
    SERVER("Управление с АРМ");

    private final String displayValue;
    Control(String control) {
        this.displayValue = control;
    }
}
