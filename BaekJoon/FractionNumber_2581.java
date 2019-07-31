import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.util.StringTokenizer;


public class FractionNumber_2581 {

    public static void main(String[] args) throws IOException, NumberFormatException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m,n;
        int result1, result2;
        int root;
        boolean flag=false;

        m = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());
        result1=0;
        result2=0;

        for(int i=m; i<=n; i++){
            root = (int) Math.sqrt(i);
            if(i!=1) {
                flag = true;
            }
            for(int j=2; j<= root; j++){
                if(i==2){
                    flag = true;
                    break;
                }
                if(i%j==0) {
                    flag = false;
                    break;
                }
            }

            if(flag){
                result1 += i;
                if (result2 == 0) {
                    result2 = i;
                }
            }
        }

        if(result1==0) {
            System.out.println("-1");
        } else {
            System.out.println(result1 + "\n" + result2);
        }
    }
}
