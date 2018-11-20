package Methods;

public class Merge {
    public Merge(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        mergeSortHelper(arr,0,n-1,temp);
    }
    public void mergeSortHelper(int[] arr,int left,int right, int[] temp) {
        if (left < right) {
            int mid = (left+right)/2;
            mergeSortHelper(arr,left,mid,temp);
            mergeSortHelper(arr,left,mid+1,temp);
        }
    }
}
