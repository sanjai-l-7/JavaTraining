public class temp{
    public static void main(String[] args){
        int m=28;
        int n=60;
        for(int i=m;i<=n;i++){
            int temp = i;
            int d1 = temp%10;
            temp/=10;
            int d2 = temp%10;
            int sum = d1+d2;
            int pro = d1*d2;
            if(sum+pro == i){
                System.out.println(i);
            }
        }

    }
}
