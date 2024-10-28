public class Heavy extends Vehicles
{
    public int how_many_trailers_the_vehicle_can_pull;

    public Heavy(int age_of_car, int amount_of_wheels, boolean steering_shape, int pollutant_emissions_per_minute, int num_of_car,int how_many_trailers_the_vehicle_can_pull)
    {
        super(age_of_car, amount_of_wheels, steering_shape, pollutant_emissions_per_minute, num_of_car);
        this.how_many_trailers_the_vehicle_can_pull = how_many_trailers_the_vehicle_can_pull;
    }

    @Override
    public double exhaust()
    {
        return super.exhaust() + (how_many_trailers_the_vehicle_can_pull * 500);
    }

    public int how_many_trailers_the_vehicle_can_pull() {
        return how_many_trailers_the_vehicle_can_pull;
    }

    public void setHow_many_trailers_the_vehicle_can_pull(int how_many_trailers_the_vehicle_can_pull) {
        this.how_many_trailers_the_vehicle_can_pull = how_many_trailers_the_vehicle_can_pull;
    }

    @Override
    public String toString() {
        return super.toString() + "Heavy{" +
                "how_many_trailers_the_vehicle_can_pull=" + how_many_trailers_the_vehicle_can_pull +
                '}';
    }
}
