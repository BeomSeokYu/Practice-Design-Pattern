package structural.composite;

public class Leaf extends Component {
    private int price;

    public Leaf(String name) {
        name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
