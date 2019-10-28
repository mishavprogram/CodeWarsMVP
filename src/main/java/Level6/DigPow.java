package Level6;

public class DigPow {

    public static long digPow(int n, int p) {

        int countOfNumbers = 1;
        int nTemp = n;
        while (nTemp/10>0){
            countOfNumbers++;
            nTemp/=10;
        }

        int[] arr = new int[countOfNumbers];
        nTemp = n;
        for (int i=countOfNumbers-1; i>=0; i--){
            int c = nTemp%10;
            arr[i] = c;
            nTemp/=10;
        }

        int s = 0;
        for (int i=0; i<countOfNumbers; i++){
            s+=Math.pow(arr[i], p+i);
        }

        int k = s/n;

        if (k*n==s){
            return k;
        }
        return -1;
    }
}
