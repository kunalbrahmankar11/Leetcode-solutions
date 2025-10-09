package Recursion;

public class Happy_Number_202 {
    public static boolean isHappy(int n){
        if(n==1 || n==7) return true;
        else if(n<10) return false;
        else{
            int sum = 0 ;
            while(n>0){
                int rem = n % 10;
                sum = sum + (rem*rem);
                n = n/10;
                
            }
            return isHappy(sum);
        }
    }

    public static void main(String[] args) {
        int n  = 19;
        System.out.println(isHappy(n));
    }
}
