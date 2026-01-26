package star_patterns;

public class pattern3 {
    public static void main(String[] args) {
        // top down right angle triangle star pattern
        for(int i=1; i<=5 ; i++){
            for(int j=i; j<=5; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
