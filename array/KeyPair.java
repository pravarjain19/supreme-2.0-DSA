import java.util.Arrays;

public class KeyPair {

    /*
     * Input:
            N = 6, X = 16
            Arr[] = {1, 4, 45, 6, 10, 8}
            Output: Yes
            Explanation: Arr[3] + Arr[4] = 6 + 10 = 16
     * 
     */

    // Solution
     boolean hasArrayTwoCandidates(int arr[], int n, int x) {

        // Two pointer approch , sort the array and find the pair low and high 
        Arrays.sort(arr);
        
        int l = 0 ; 
        int h = n-1;
        
        while(l<h){
            int cusum  = arr[l] + arr[h];
            if(cusum == x){
                return true;
            }
            else if (cusum>x) {
                h--;
            }
            else{
                l++;
        }
    }
    return false;
}
    
}
