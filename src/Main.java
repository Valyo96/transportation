import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Truck> trucks = new ArrayList<>();
        List<Load> loads = new ArrayList<>();
        String name;
        int loadCapacity;
        do {
            System.out.print("Enter the names of the trucks: ");
            name = sc.nextLine();
            System.out.print("Enter load capacity: ");
            loadCapacity = sc.nextInt();
            String fake= sc.nextLine();
            Truck truck = new Truck(name, loadCapacity);
            System.out.println(truck);
            trucks.add(truck);
        } while (!name.equals("end"));

        do {
            System.out.print("Enter the names of the loads: ");
            name = sc.nextLine();
            System.out.print("Enter the weight of the load: ");
            loadCapacity = sc.nextInt();
            String fake2= sc.nextLine();

            Load load = new Load(name, loadCapacity);
            System.out.println(load);
            loads.add(load);
        } while (!name.equals("end"));
        String typeOfLoad;
        do {
            System.out.print("Enter the truck you want to load: ");
            name = sc.nextLine();
            System.out.println("Enter what type of load you want in the truck: ");
            typeOfLoad = sc.nextLine();
            String fake= sc.nextLine();
            Truck currentTruck=null;
            for (Truck truck : trucks) {
                if (truck.getName().equals(name)) {
                    currentTruck = truck;
                }
            }

            Load currentLoad=null;
            for (int i = 0; i < loads.size(); i++) {
                if (loads.get(i).getName().equals(typeOfLoad)) {
                    currentLoad = loads.get(i);
                }
            }
            if (currentTruck!=null&& currentLoad!=null){
                currentTruck.loading(currentLoad);
                System.out.println(currentTruck);
            }else{
                System.out.println("There is not such a load or truck!");
            }
        } while (!name.equals("end"));
    }
}