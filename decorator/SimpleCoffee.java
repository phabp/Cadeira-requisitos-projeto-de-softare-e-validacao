package decorator;

public class SimpleCoffee implements Coffee {
    
    @Override
    public double getPrice() {
        return 5.0;
    }
}
