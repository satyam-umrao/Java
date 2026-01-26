package star_patterns;

public class pattern5 {
    public static void main(String[] args) {
        // simple hollow square star pattern
        int n=5;
        for(int i=1 ; i<=5 ; i++){
          for(int j=1 ; j<=5 ; j++){
            if(i==1 || j==1 || i==n || j==n){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }
          }
          System.out.println(" ");
        }
    }
}
