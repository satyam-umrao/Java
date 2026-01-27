package star_patterns;

public class pattern02 {
    public static void main(String[] args) {
        // simple right angle triangle star pattern
        for(int i=1 ; i<=5 ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

// <<<-------------- Output -------------------->

// * 
// ** 
// *** 
// **** 
// ***** 