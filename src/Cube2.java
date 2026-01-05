public class Cube2 {
    private Cube basicCube;
    private String color;

    public Cube2() {
        basicCube = new Cube();
        this.color = "black";
    }

    public Cube2(int side) {
        this();
        basicCube.setSide(side);
    }

    public Cube2(int side, String color) {
        basicCube = new Cube(side);
        this.color = color;
    }


    public void setSide(int side) {
        basicCube.setSide(side);
    }

    public int getSide() {
        return basicCube.getSide();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private boolean isPythagoreanTriple(int a, int b, int c) {
        long a2 = (long) a * a;
        long b2 = (long) b * b;
        long c2 = (long) c * c;
        return (a2 + b2 == c2) || (a2 + c2 == b2) || (b2 + c2 == a2);
    }

    //the following methods have been started for you, but need to be completed
    public int calculateVolume() {
        return basicCube.calculateVolume();
    }

    public int calculateSurfaceArea() {
        return basicCube.calculateSurfaceArea();
    }

    public Cube2 add(Cube2 otherCube) {
        int totalSurface = this.calculateSurfaceArea() + otherCube.calculateSurfaceArea();
        if (totalSurface % 6 != 0) throw new IllegalArgumentException();
        int faceArea = totalSurface / 6;
        int side = (int) Math.sqrt(faceArea);
        if (side * side != faceArea || side < 1) throw new IllegalArgumentException();
        if (!isPythagoreanTriple(this.getSide(), otherCube.getSide(), side)) throw new IllegalArgumentException();
        return new Cube2(side, this.color);
    }

    public Cube2 minus(Cube2 otherCube) {
        int diffSurface = this.calculateSurfaceArea() - otherCube.calculateSurfaceArea();
        if (diffSurface <= 0 || diffSurface % 6 != 0) throw new IllegalArgumentException();
        int faceArea = diffSurface / 6;
        int side = (int) Math.sqrt(faceArea);
        if (side * side != faceArea || side < 1) throw new IllegalArgumentException();
        if (!isPythagoreanTriple(this.getSide(), otherCube.getSide(), side)) throw new IllegalArgumentException();
        return new Cube2(side, this.color);
    }

    public boolean equals(Cube2 otherCube) {
        return otherCube != null && this.getSide() == otherCube.getSide() && this.color.equals(otherCube.color);
    }

    public String toString() {
        return "Cube{side=" + getSide() + ", color=\"" + color + "\"}";
    }

    void main() {
    }
}