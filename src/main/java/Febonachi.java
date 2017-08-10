/**
 * Created by VicTOR on 05.08.2017.
 */
public class Febonachi {
    public static void main(String[] args) {
        int input = 12;
        int k = 0;
        int[] prev = {1, 1};
        //System.out.print("begin: " + prev[0] + " " + prev[1] + "\n");
        for(int i = 0; i < input; i++){
            if( i < 2 )
            System.out.print(prev[i] + " ");
            else{
                k = prev[0] + prev[1];
                prev[0] = prev[1];
                prev[1] = k;
                System.out.print(k + " ");
            }
            //comment 2

        }
        System.out.println("Mishka privet!!!");
    }
}
