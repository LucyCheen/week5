public class Array {
    public static void main(String[] args) {
        String[] heroes = {"Iron man","Captain","Hulk","Thor"};
        System.out.println(heroes[1]);
        System.out.println(heroes.length);
        System.out.println(heroes[heroes.length-1]);

        String[] anotherHeroes = new String[3];
        anotherHeroes[0] = "Black window";
        anotherHeroes[1] = "Hawkeye";
        System.out.println(anotherHeroes[0]);
        System.out.println(anotherHeroes[2]);
    }
}
