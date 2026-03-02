package decorator;

public class MilkDecorator implements Coffee {
    
    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getPrice() {
        return coffee.getPrice() + 2.0;
    }
}
