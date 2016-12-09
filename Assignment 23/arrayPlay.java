
/**
 * Write a description of class arrayPlay here.
 * 
 * @author Cash Johnson 
 * @version 10/29/16
 */
public class arrayPlay
{
    static int[] randoNums = { 10, 20, 15, 25, 17, 5, 34, 23, 15 };
    public static void main (String [] args) {
        System.out.println(maxVal(randoNums));
    }
    
    public static int maxVal (int[] n) {
        int curMaxVal = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] > curMaxVal) {
                curMaxVal = n[i];
            }
        }
        return curMaxVal;
    }
}
