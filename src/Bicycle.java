public class Bicycle extends Light
{
    private boolean There_is_a_basket;

    public Bicycle(int age_of_car, int amount_of_wheels, boolean steering_shape, int pollutant_emissions_per_minute, int num_of_car, boolean There_is_an_engine,boolean There_is_a_basket) {
        super(age_of_car, amount_of_wheels, steering_shape, pollutant_emissions_per_minute, num_of_car, There_is_an_engine);
        this.There_is_a_basket = There_is_a_basket;
    }

    public boolean There_is_a_basket() {
        return There_is_a_basket;
    }

    public void setThere_is_a_basket(boolean there_is_a_basket) {
        There_is_a_basket = there_is_a_basket;
    }

    @Override
    public String toString() {
        return toString() + "Bicycle{" +
                "There_is_a_basket=" + There_is_a_basket +
                '}';
    }
}
