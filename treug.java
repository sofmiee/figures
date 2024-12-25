public class treug {
    private int side_a;
    private int side_b;
    private int side_c;

    public treug(int side_a, int side_b, int side_c) {
        if (side_a < 0 || side_b < 0 || side_c < 0) { //должно одновременно выполняться условие
            throw new IllegalArgumentException("There is no figure with such parameters");
        } else {
            this.side_a = side_a;
            this.side_b = side_b;
            this.side_c = side_c;
        }
    }
    public double area() {
        double P = (double) (side_a + side_b + side_c) / 2;
        return Math.sqrt((P * (P - side_a) * (P - side_b) * (P - side_c)));
    }
    public int perimeter() {
        return side_a + side_b + side_c;
    }
}
