package structural.composite.ex1;

public class Leaf extends Component {
    private String data;

    public Leaf(String data) {
        this.data = data;
        setName(data);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
