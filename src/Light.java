public class Light extends Vehicles
{
    private boolean There_is_an_engine;


    public Light(int age_of_car, int amount_of_wheels, boolean steering_shape, int pollutant_emissions_per_minute, int num_of_car,boolean There_is_an_engine) {
        super(age_of_car, amount_of_wheels, steering_shape, pollutant_emissions_per_minute, num_of_car);
        this.There_is_an_engine = There_is_an_engine;
    }

    public boolean There_is_an_engine() {
        return There_is_an_engine;
    }

    public void setThere_is_an_engine(boolean there_is_an_engine) {
        There_is_an_engine = there_is_an_engine;
    }

    @Override
    public String toString() {
        return super.toString() + "Light{" +
                "There_is_an_engine=" + There_is_an_engine +
                '}';
    }
}
