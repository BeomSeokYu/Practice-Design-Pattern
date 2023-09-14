package builder;

public class Memory {
    private Integer size;

    public Memory(Integer size) {
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
