class BubleSort{

    int[] arr = {3,7,2,9,6,6,6,3};
    int arrLength = 8;

    boolean isSorted(){
      for(int i=0; i<this.arrLength-1; i++){
        if(this.arr[i] > this.arr[i+1]){
          return false;
        }
      }
      return true;
    }

    void arraySort(){
      int tmp;
      for(int i = 0; i< arrLength; i++){
        for(int k = 0; k < arrLength-1; k++){
            if(arr[k] > arr[k+1]){
              tmp = arr[k];
              arr[k] = arr[k+1];
              arr[k+1] = tmp;
            }
        }
      }
    }

    public static void main(String[] args){

      BubleSort arr = new BubleSort();

      if(arr.isSorted()){
        System.out.println("Array Sorted");
      } else{
        arr.arraySort();
        for(int i=0; i<arr.arrLength;i++){
          System.out.print(arr.arr[i] + " ");
        }
      }
    }

}
