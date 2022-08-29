public class ElonsToyCar {
    private static int distance;
    private static int battery;
    public ElonsToyCar(){   ElonsToyCar.distance = 0;
        ElonsToyCar.battery = 100;
    }
    public static ElonsToyCar buy() {
        ElonsToyCar.distance = 0;
        ElonsToyCar.battery = 100;
        return new ElonsToyCar();
        }

    public String distanceDisplay() {
    
        return "Driven "+ElonsToyCar.distance+" meters";
    }

    public String batteryDisplay() {
        if(ElonsToyCar.battery <= 0) return "Battery empty";
    return "Battery at "+ElonsToyCar.battery+"%";
    }

    public void drive() {
   if(ElonsToyCar.battery > 0){   ElonsToyCar.distance += 20;    ElonsToyCar.battery--;
    }
        }
}
