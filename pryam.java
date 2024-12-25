public class pryam {
    private int side_a;
    private int side_b;

    public pryam(int side_a, int side_b) {
        if (side_a < 0 || side_b < 0) {
            throw new IllegalArgumentException("There is no figure with such parameters");
        } else {
            this.side_a = side_a;
            this.side_b = side_b;
        }
    }
    public int area() {
        return side_a * side_b;
    }
    public int perimeter() {
        return side_a + side_b;
    }
}