public class Q7 {
    public static void main(String[] args) {
        int n=4;
        System.out.println(sum( n));
    }
    public static int sum(int n){
        int sum=0;
        for(int i=0;i<=n;i++){


                sum+=i*i;
        }
        return sum;

    }
}
