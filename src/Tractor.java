public class Tractor extends Heavy
{
    private String Types_of_trailers;


    public Tractor(int age_of_car, int amount_of_wheels, boolean steering_shape, int pollutant_emissions_per_minute, int num_of_car, int how_many_trailers_the_vehicle_can_pull,String Types_of_trailers) {
        super(age_of_car, amount_of_wheels, steering_shape, pollutant_emissions_per_minute, num_of_car, how_many_trailers_the_vehicle_can_pull);
        this.Types_of_trailers = Types_of_trailers;
    }

    public String Types_of_trailers() {
        return Types_of_trailers;
    }

    public void setTypes_of_trailers(String types_of_trailers) {
        Types_of_trailers = types_of_trailers;
    }

    @Override
    public String toString() {
        return super.toString() + "Tractor{" +
                "Types_of_trailers='" + Types_of_trailers + '\'' +
                '}';
    }
}
