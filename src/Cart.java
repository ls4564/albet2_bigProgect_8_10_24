public class Cart extends Light
{
        private int loading_time;

    public Cart(int age_of_car, int amount_of_wheels, boolean steering_shape, int pollutant_emissions_per_minute, int num_of_car, boolean There_is_an_engine,int loading_time) {
        super(age_of_car, amount_of_wheels, steering_shape, pollutant_emissions_per_minute, num_of_car, There_is_an_engine);
        this.loading_time = loading_time;
    }

    @Override
    public double exhaust()
    {
        return super.exhaust() * 1.2 ;
    }

    public void hitchhikers()
    {
        System.out.println("Can't tack hitchhikers.");
    }

    public int loading_time() {
        return loading_time;
    }

    public void setLoading_time(int loading_time) {
        this.loading_time = loading_time;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "loading_time=" + loading_time +
                '}';
    }
}
