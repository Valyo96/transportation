import java.util.ArrayList;
import java.util.List;

public class Truck {
    protected String name;
    protected int loadCapacity;
    protected int currentCapacity;
    protected List<Load> loads;

    public Truck(String name, int loadCapacity) {
        this.setName(name);
        this.setLoadCapacity(loadCapacity);
        this.setCurrentCapacity(loadCapacity);
        loads = new ArrayList<Load>();
    }

    public void setName(String name) {
        if (name.length() != 0) {
            this.name = name;
        } else {
            System.out.println("Name cannot be emptied");
        }
    }

    public String getName() {
        return this.name;
    }

    public void setLoadCapacity(int capacity) {
        if (capacity >= 0) {
            this.loadCapacity = capacity;
        } else {
            System.out.println("Weight cannot be negative!");
        }
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        if (currentCapacity >= 0) {
            this.currentCapacity = currentCapacity;
        } else {
            System.out.println("Weight cannot be negative!");
        }
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void loading(Load load) {
        if (getLoadCapacity() >= load.weight && getCurrentCapacity() >= load.weight) {
            setCurrentCapacity(currentCapacity - load.weight);
            this.loads.add(load);
            System.out.println(getName() + " is loaded successfully with " + load.getName());
        } else {
            System.out.println(getName() + " cannot be loaded with " + load.getName());
        }
    }

    @Override
    public String toString() {
        return "Truck{" +
                "name='" + name + '\'' +
                ", loadCapacity=" + loadCapacity +
                ", currentCapacity=" + currentCapacity +
                ", loads=" + loads +
                '}';
    }
}
