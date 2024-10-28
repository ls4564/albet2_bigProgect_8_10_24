public class Truck extends Heavy
{
    private double Maximum_loading_weight;

    public Truck(int age_of_car, int amount_of_wheels, boolean steering_shape, int pollutant_emissions_per_minute, int num_of_car, int how_many_trailers_the_vehicle_can_pull,double Maximum_loading_weight) {
        super(age_of_car, amount_of_wheels, steering_shape, pollutant_emissions_per_minute, num_of_car, how_many_trailers_the_vehicle_can_pull);
        this.Maximum_loading_weight = Maximum_loading_weight;
    }

    @Override
    public double exhaust()
    {
        return super.exhaust() * 1.5;
    }

    public double Maximum_loading_weight() {
        return Maximum_loading_weight;
    }

    public void setMaximum_loading_weight(double maximum_loading_weight) {
        Maximum_loading_weight = maximum_loading_weight;
    }


    @Override
    public String toString() {
        return toString() + "Truck{" +
                "how_many_trailers_the_vehicle_can_pull=" + how_many_trailers_the_vehicle_can_pull +
                ", Maximum_loading_weight=" + Maximum_loading_weight +
                '}';
    }
}
