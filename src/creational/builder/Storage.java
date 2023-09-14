package creational.builder;

public class Storage {
    private Integer size;

    public Storage(Integer size) {
        if (size != null) {
            this.size = size;
        }
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getSize() {
        return size;
    }
}
