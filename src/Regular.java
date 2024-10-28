public class Regular extends Vehicles
{
    private int number_of_passengers;

    public Regular(int age_of_car, int amount_of_wheels, boolean steering_shape, int pollutant_emissions_per_minute, int num_of_car,int number_of_passengers) {
        super(age_of_car, amount_of_wheels, steering_shape, pollutant_emissions_per_minute, num_of_car);
        this.number_of_passengers = number_of_passengers;
    }

    @Override
    public double exhaust()
    {
        return super.exhaust() + 20 ;
    }

    @Override
    public void noise()
    {
        System.out.println("The noise intensity of of the car is loud");
    }

    public void hitchhikers()
    {
        System.out.println("Can tack allot of hitchhikers.");
    }


    public int number_of_passengers() {
        return number_of_passengers;
    }

    public void setNumber_of_passengers(int number_of_passengers) {
        this.number_of_passengers = number_of_passengers;
    }

    @Override
    public String toString() {
        return super.toString() + "Regular{" +
                "number_of_passengers=" + number_of_passengers +
                '}';
    }
}
