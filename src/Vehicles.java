public class Vehicles
{
    private int num_of_car;
    private int age_of_car;
    private int amount_of_wheels;
    boolean Steering_shape;
    private int pollutant_emissions_per_minute;

    public Vehicles(int age_of_car, int amount_of_wheels, boolean steering_shape, int pollutant_emissions_per_minute, int num_of_car) {
        this.age_of_car = age_of_car;
        this.amount_of_wheels = amount_of_wheels;
        this.Steering_shape = steering_shape;
        this.pollutant_emissions_per_minute = pollutant_emissions_per_minute;
        this.num_of_car = num_of_car;
    }

    public double exhaust()
    {
        return pollutant_emissions_per_minute;
    }

    public void noise()
    {
        System.out.println("difficult noise.");
    }

    public int age_of_car() {
        return age_of_car;
    }

    public int amount_of_wheels() {
        return amount_of_wheels;
    }

    public boolean Steering_shape() {
        return Steering_shape;
    }

    public int pollutant_emissions_per_minute() {
        return pollutant_emissions_per_minute;
    }

    public int num_of_car() {
        return num_of_car;
    }

    public void setNum_of_car(int num_of_car) {
        this.num_of_car = num_of_car;
    }

    public void setAge_of_car(int age_of_car) {
        this.age_of_car = age_of_car;
    }

    public void setAmount_of_wheels(int amount_of_wheels) {
        this.amount_of_wheels = amount_of_wheels;
    }

    public void setSteering_shape(boolean steering_shape) {
        Steering_shape = steering_shape;
    }

    public void setPollutant_emissions_per_minute(int pollutant_emissions_per_minute) {
        this.pollutant_emissions_per_minute = pollutant_emissions_per_minute;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "num_of_car=" + num_of_car +
                ", age_of_car=" + age_of_car +
                ", amount_of_wheels=" + amount_of_wheels +
                ", Steering_shape=" + Steering_shape +
                ", pollutant_emissions_per_minute=" + pollutant_emissions_per_minute +
                '}';
    }
}
