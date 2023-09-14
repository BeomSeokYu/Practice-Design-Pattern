package prototype;

public class Prototype implements Cloneable{
    private int value = 0;

    public Prototype() {
        System.out.println("생성자 호출");
    }

    public Prototype(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public Prototype clone() {
        try {
            Prototype clone = (Prototype) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            clone.value = 0;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
