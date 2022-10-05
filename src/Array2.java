import java.util.Collections;

public class Array2 {
    public static void main (String[] args) {
        java.util.ArrayList<String> manyHeroes = new java.util.ArrayList<>();
        manyHeroes.add("Iron man");
        manyHeroes.add("Ant man");
        manyHeroes.add("spider man");
        System.out.println(manyHeroes.size());
        System.out.println(manyHeroes.get(2));

        Collections.sort(manyHeroes);
        System.out.println(manyHeroes);

        manyHeroes.clear();
        System.out.println(manyHeroes.size());

    }
}
