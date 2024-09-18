package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {
    private int maximumCapacity;
    private List<Thing> things;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.things = new ArrayList<>();
    }

    public boolean addThing(Thing thing) {
        if (this.getVolume() + thing.getVolume() <= this.maximumCapacity) {
            this.things.add(thing);
            return true;
        }
        return false;
    }

    @Override
    public int getVolume() {
        int currentVolume = 0;
        for (Thing thing : this.things)  {
            currentVolume += thing.getVolume();
        }
        return currentVolume;
    }

    @Override
    public String toString() {
        return "Box (" + getVolume() + " / " + maximumCapacity + " dm^3)";
    }
}
