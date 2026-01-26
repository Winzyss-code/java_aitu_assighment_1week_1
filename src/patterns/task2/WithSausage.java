package patterns.task2;

// WithSausage.java
public class WithSausage extends PizzaDecorator {
    public WithSausage(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    @Override
    public double getCost() {
        return super.getCost() + 25;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", колбаса";
    }
}
