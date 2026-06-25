//Solved a DSA Problem in which i have to merge two different sorted array into one array
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr=new int[nums1.length];

        int i=0;
        int j=0,k=0;
        while((j<m && k<n)){
            if(nums1[j]<nums2[k]){
                arr[i]=nums1[j];
                j++;
            }
            else{
                arr[i]=nums2[k];
                k++;
            }
            i++;
        }

        while(j<m){
            arr[i]=nums1[j];
            i++;
            j++;
        }

        while(k<n){
            arr[i]=nums2[k];
            i++;
            k++;
        }

        for(i=0;i<nums1.length;i++){
            nums1[i]=arr[i];
        }
    }
}
