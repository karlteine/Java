package moving.domain;

public class Item implements Thing, Comparable<Item> {
    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.volume + " dm^3)";
    }

    @Override
    public int compareTo(Item o) {
        return Integer.compare(this.volume, o.volume);
    }
}
