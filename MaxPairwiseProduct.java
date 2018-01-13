import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    static long getMaxPairwiseProduct(long[] numbers) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        int max1Index = 0;
        int n = numbers.length;
        for (int i = 0; i < n; ++i) {
            if (numbers[i] >= max1) {
                max1 = numbers[i];
                max1Index = i;
            }
        }
//        System.out.println(max1Index);
        
        for (int i = 0; i < n; ++i) {
            if (i == max1Index) {
                continue;
            }
            else if(numbers[i] >= max2) {
                max2 = numbers[i];
            }
        }
//        System.out.println(max2);
        
        
        return max1 * max2;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        long[] numbers = new long[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            //System.out.println(numbers[i]);
        }
        System.out.println(getMaxPairwiseProduct(numbers));
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

}