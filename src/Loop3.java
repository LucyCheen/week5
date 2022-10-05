public class Loop3 {
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            for(int j=3; j>0; j--){
                System.out.println(i+","+j);
            }
            System.out.println("------");
        }
    }
}
