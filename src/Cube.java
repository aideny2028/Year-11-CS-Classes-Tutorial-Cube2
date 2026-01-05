public class Cube {

    private int side;

    public Cube() {
        this(1);
    }

    public Cube(int side) {
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        validateSide(side);
        this.side = side;
    }

    public int calculateSurfaceArea() {
        return 6 * (side * side);
    }

    public int calculateVolume() {
        return side * side * side;
    }

    @Override
    public String toString() {
        return "Cube{side=" + side + "}";
    }

    private void validateSide(int side) {
        if (side < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
    }
}