public class Load {
    protected String name;
    protected int weight;

    public Load(String name, int weight) {
        this.setName(name);
        this.setWeight(weight);
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

    public void setWeight(int weight) {
        if (weight >= 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight cannot be negative!");
        }
    }

    public int getWeight() {
        return weight;
    }


    @Override
    public String toString() {
        return "Load{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
