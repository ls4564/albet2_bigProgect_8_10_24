public class Main {
    public static void main(String[] args)
    {


    }
    public static double daily_pollutants(Vehicles[] vehicles)
    {
        //Mission: 9
        double total_pollutants = 0;

        for(Vehicles v : vehicles)
        {
            if(v != null)
            {
                total_pollutants = total_pollutants + v.exhaust();
            }
        }
        return total_pollutants;
    }
    public static void show_noise_level(Vehicles[] vehicles)
    {
        //Mission: 10
        for(Vehicles v :vehicles)
        {
            if(v != null)
            {
                v.noise();
            }
        }
    }
    public int amount_of_passengers(Vehicles[] vehicles)
    {
        //Mission: 11
        int passengers = 0;
        for(Vehicles v : vehicles)
        {
            if(v instanceof Regular)
            {
                passengers = passengers + ((Regular) v).number_of_passengers();
            }
        }
        return passengers;
    }
    public int Maximum_loading_time(Vehicles[] vehicles)
    {
        int loading_time = 0;
        for(Vehicles v : vehicles)
        {
            if(v instanceof Cart)
            {
                if(loading_time < ((Cart)v).loading_time())
                {
                    loading_time = ((Cart)v).loading_time();
                }
            }
        }
        return loading_time;
    }
}