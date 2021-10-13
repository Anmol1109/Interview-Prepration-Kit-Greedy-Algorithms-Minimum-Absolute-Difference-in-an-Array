import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'minimumAbsoluteDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int minimumAbsoluteDifference(int[] arr) {
    // Write your code here
    Arrays.sort(arr);
    
    int n = arr.length;
    int m = Integer.MAX_VALUE;
    
    for(int i = 0; i < n - 1;i++)
        {
            int curr = Math.abs(arr[i] - arr[i + 1]);
            m = Math.min(m, curr);
            if(m == 0)
                break;
        }
        return m;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr[i] = arrItem;
        }

        int result = Result.minimumAbsoluteDifference(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
