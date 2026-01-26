package star_patterns;

public class pattern6 {
    public static void main(String[] args) {
        // simple triangle pattern
        int n=10;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(i*2)-1 ; k++){
                if(k==1 || k==(i*2)-1 || i==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
