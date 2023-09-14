package creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    public String cpu;
    public List<Memory> ram = new ArrayList<>();
    public List<Storage> storage = new ArrayList<>();

    public String toString() {
        return "이 컴퓨터의 사양은 CPU=" + this.cpu
                + ", RAM=" + memory() + "GB"
                + ", Storage=" + storage() + "GB"
                + " 입니다.";
    }

    public int memory() {
        int size = 0;
        for (Memory mem : this.ram) {
            size += mem.getSize();
        }
        return size;
    }

    public int storage() {
        int size = 0;
        for (Storage disk : this.storage) {
            size += disk.getSize();
        }
        return size;
    }
}
