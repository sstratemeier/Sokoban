public class Floor implements Square {
    public boolean goal=false;

    public Floor(FloorElement floorElement){
        switch (floorElement){
            case GOAL: goal=true;
            break;
            case EMPTY: break;
        }

    }
}