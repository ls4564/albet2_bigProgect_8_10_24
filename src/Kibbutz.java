import java.util.Arrays;

public class Kibbutz
{
    private Vehicles[] arr_of_vehicles;

    public Kibbutz()
    {
        //13.1
        this.arr_of_vehicles = new Vehicles[0];
    }
    public void add_to_arr(Vehicles new_cart)
    {
        //13.2
        int i = 0;
        int count = 0;
        while( i < arr_of_vehicles.length && count == 0 )
        {
            if(arr_of_vehicles[i] == null)
            {
                arr_of_vehicles[i] = new_cart;
                count ++ ;
            }
            else
            {
                i++;
            }
        }
    }
    public Vehicles[] Old_car_with_wheel()
    {
        //13.3
        Vehicles[] old_Vehicles = new Vehicles[500];
        int count = 0;
        for(Vehicles v : arr_of_vehicles)
        {
            if(v.age_of_car() >= 15 && v.Steering_shape())
            {
                old_Vehicles[count] = v;
                count ++;
            }
        }
        return old_Vehicles;
    }
    public int Light_vehicles_with_steering_wheel()
    {
        int count = 0;
        //13.4
        for(Vehicles v : arr_of_vehicles)
        {
            if(v instanceof Light)
            {
                if(((Light)v).Steering_shape())
                {
                    count ++;
                }
            }
        }
        return count;
    }



    public Vehicles[] arr_of_vehicles() {
        return arr_of_vehicles;
    }

    public void setArr_of_vehicles(Vehicles[] arr_of_cars) {
        this.arr_of_vehicles = arr_of_cars;
    }

    @Override
    public String toString() {
        return "Kibbutz{" +
                "arr_of_cars=" + Arrays.toString(arr_of_vehicles) +
                '}';
    }
}
