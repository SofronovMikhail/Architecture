package Sem3.DIP;

public class Car implements Engine {

    private TypeEngine engine;

    public Car(TypeEngine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
    }

}
