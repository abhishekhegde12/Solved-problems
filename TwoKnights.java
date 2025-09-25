import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class TwoKnights {

    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k=0;
        try {
            k = Integer.parseInt(br.readLine());
            for(int i=1; i<=k; i++) {
            long res =(long) (((i*i)*((i*i)-1))/2) - (4*(i-1)*(i-2));
            bw.write(res+"\n");
            bw.flush();
        }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
