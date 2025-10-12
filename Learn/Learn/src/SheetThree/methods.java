package SheetThree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class methods {
    public static int [] insertAt (int [] arr , int ele , int pos) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        for(int i=arr.length - 1; i > pos ;i--) {
            arr[i] = arr[i-1];
        }
        arr[pos] = ele;
        return arr;
    }
    private static boolean check (int p) {
        if (p == 1 || p == 0) {
            return false;
        }
        for(int i=2 ;i <= Math.sqrt(p);i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int [] PrimeArray (int [] arr) {
        ArrayList<Integer> prime = new ArrayList<>();
        for(int a : arr) {
            if(check(a)) {
                prime.add(a);
            }
        }
        int [] pri = new int[prime.size()];
        for(int i=0;i<pri.length;i++) {
            pri[i] = prime.get(i);
        }
        return pri;
    }
    public static int [][][] getFactors (int [] arr ) {
        List<int[][]> fac = new  ArrayList<>();
        for(int a : arr) {
            List<int[]> temp  = new  ArrayList<>();
            for(int i=1 ; i <= a ;i++) {
                if ((a%i==0)) {
                    if ((i&1)==0) {
                        temp.add(new int[]{i, 1});
                    }else {
                        temp.add(new int[]{i, 0});
                    }
                }
            }
            fac.add(temp.toArray(new int[temp.size()][]));
        }
        int [][][]res = new int [fac.size()][][];
        for(int i=0;i<fac.size();i++) {
            res[i] = fac.get(i);
        }
        return res;
    }
}

