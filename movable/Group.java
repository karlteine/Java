package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    private List<Movable> movables;

    public Group() {
        this.movables = new ArrayList<>();
    }

    public void addToGroup(Movable movable) {
        movables.add(movable);
    }

    @Override
    public String toString() {
         StringBuilder str = new StringBuilder();
         for (Movable movable : movables) {
             str.append(movable.toString()).append("\n");
         }
         return str.toString();
    }

    @Override
    public void move(int dx, int dy) {

    }
}
