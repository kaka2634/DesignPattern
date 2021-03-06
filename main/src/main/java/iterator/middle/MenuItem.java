package iterator.middle;

public class MenuItem {
    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price) {
       this.name = name;
       this.description = description;
       this.vegetarian = vegetarian;
       this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public boolean isVegetarian() {
        return this.vegetarian;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append("----");
        sb.append(getPrice());
        sb.append("----");
        sb.append(getDescription());
        return sb.toString();
    }

}
