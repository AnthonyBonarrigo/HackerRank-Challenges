/**Week of Code 21: Kangaroo
*There are two kangaroos on an x-axis ready to jump in the positive direction (i.e, toward 
*positive infinity). The first kangaroo starts at location x1  and moves at a rate of v1  meters per 
*jump. The second kangaroo starts at location x1  and moves at a rate of v2  meters per jump. 
*Given the starting locations and movement rates for each kangaroo, can you determine if 
*they'll ever land at the same location at the same time?
*/
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        boolean found = false;
        if((x2 > x1 && v2 > v1) || (x1 > x2 && v1 > v2)) System.out.print("NO");
        else{
            //run 100 tests
            for(int i = 0; i < 100; i++){
                x1 += v1;
                x2 += v2;
                if(x1 == x2) {System.out.print("YES"); found = true; break;}
            }
            if(found == false) System.out.print("NO");
        }
    }
}
