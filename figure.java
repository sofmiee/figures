public class figure {
    public static void main(String[] args) {
        krug krug = new krug(5);
        System.out.println(krug.area());
        System.out.println(krug.perimeter());


        treug treug = new treug(1, 6, 3);
        System.out.println(treug.area());
        System.out.println(treug.perimeter());


        pryam pryam = new pryam(8, 3);
        System.out.println(pryam.area());
        System.out.println(pryam.perimeter());
    }
}