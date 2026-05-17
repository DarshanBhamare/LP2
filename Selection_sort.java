public class Selection_sort {
    public static void main(String[]args){
        int[]arr={64,25,12,22,11,11};
        int n=arr.length;
        System.out.println("Original array:");
        for(int i=0;i<n;i++){       
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }

            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
        System.out.println("\nSorted array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
