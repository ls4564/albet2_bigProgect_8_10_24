public class Wheel extends Truck
{
    String Tire_thickness;
    public Wheel(int age_of_car, int amount_of_wheels, boolean steering_shape, int pollutant_emissions_per_minute, int num_of_car, int how_many_trailers_the_vehicle_can_pull, double Maximum_loading_weight,String Tire_thickness) {
        super(age_of_car, amount_of_wheels, steering_shape, pollutant_emissions_per_minute, num_of_car, how_many_trailers_the_vehicle_can_pull, Maximum_loading_weight);
        this.Tire_thickness = Tire_thickness;
    }

    public String Tire_thickness() {
        return Tire_thickness;
    }

    public void setTire_thickness(String tire_thickness) {
        Tire_thickness = tire_thickness;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "Tire_thickness='" + Tire_thickness + '\'' +
                '}';
    }
}
