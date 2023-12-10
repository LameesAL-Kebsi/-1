public class Q6 {
    public static void main(String[] args) {
        int n=9;
        System.out.println(sum( n));
    }
    public static int sum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2==1){
            sum+=i;}
        }
        return sum;

    }
}
