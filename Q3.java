// Count the subarrays having product less than k

//https://practice.geeksforgeeks.org/problems/count-the-subarrays-having-product-less-than-k1708/1/

class Solution {
    public int countSubArrayProductLessThanK(long a[], long n, long k)
    {
        long m=1;
        int res=0, l=0;
            for(int i = 0 ; i < n ; i++){
                m*=a[i];
                while( l<n && m>=k){
                    m /= a[l++] ;
                }
                res+=(i-l+1);
            }
        return (int)res;
    }
}
