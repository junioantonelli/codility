public class MissingInteger {
    
    public int solution(int[] A) {
        // N -> size of A
        // Integers in A have a range [1:N+1] with a length of N
        // They are all distinct
        // N has a range [0:N+1]
        if(A.length<2){
            if(A.length == 1){
                if(A[0] == 1){
                    return 2;
                }
                else{
                    return A[0]-1;
                }
            }else{
                return 0;
            }
        }

        mergesort(0,A.length-1,A);
        for(int i = 1; i < A.length; i++){
            if((A[i-1]+1) != A[i]){
                return A[i-1]+1;
            }
        }
        if(A[0] == 1){
            return A[A.length-1]+1;
        }
        return A[0]-1;
    }

    public void mergesort(int left, int right, int[] A){
        if(left < right){
            int middle = (right+left)/2; //(left + (right-left)/2)
            mergesort(left,middle,A);
            mergesort(middle+1,right,A);
            merge(left,middle,right,A);
        }
    }

    public void merge(int left, int middle, int right, int[] A){
        int i = left;
        int j = middle+1;
        int k = 0;
        int[] temp = new int[right-left+1];
        while(k<right-left+1){
            while(i<=middle && j<=right){
                if(A[i]<A[j]){
                    temp[k++] = A[i++];
                }
                if(A[j]<=A[i]){
                    temp[k++] = A[j++];
                }
            }
            if(i<=middle){
                temp[k++] = A[i++];
            }
            if(j<=right){
                temp[k++] = A[j++];
            }
        }
        for (int l = left; l <= right; l++) {
            A[l] = temp[l-left];
        }
    }
}
