public class Classroom {

    public static void main(String[] args) {

        Wilder marcel = new Wilder("Marcel", false);
        Wilder marceline = new Wilder ("Marceline", true);
        Wilder ginette = new Wilder("Ginette", false);

        System.out.println(marcel.whoAmI());
        System.out.println(marceline.whoAmI());
        System.out.println(ginette.whoAmI());
    }
}

