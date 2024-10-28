public class Rib extends Regular
{
    private int meters;

    public Rib(int age_of_car, int amount_of_wheels, boolean steering_shape, int pollutant_emissions_per_minute, int num_of_car, int number_of_passengers,int meters) {
        super(age_of_car, amount_of_wheels, steering_shape, pollutant_emissions_per_minute, num_of_car, number_of_passengers);
        this.meters = meters;
    }

    public int meters() {
        return meters;
    }

    public void setMeters(int meters) {
        this.meters = meters;
    }

    @Override
    public String toString() {
        return super.toString() + "Rib{" +
                "meters=" + meters +
                '}';
    }
}
