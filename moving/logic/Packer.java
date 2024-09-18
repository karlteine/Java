package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;
import java.util.ArrayList;
import java.util.List;

public class Packer {
    private final int boxVolume;

    public Packer(int boxVolume) {
        this.boxVolume = boxVolume;
    }
    public List<Box> packThings(List<Thing> things) {
        List<Box> boxes = new ArrayList<>();
        Box currentBox = new Box(boxVolume);

        for (Thing thing : things) {
            if (!currentBox.addThing(thing)) {
                boxes.add(currentBox);
                currentBox = new Box(boxVolume);
                currentBox.addThing(thing);
            }
        }

        if (currentBox.getVolume() > 0) {
            boxes.add(currentBox);
        }

        return boxes;
    }

}
