public class Activity1 extends IntegerManager implements PrintPretty{
    public static void main(String[] args) throws Exception {
        Activity1 thingie = new Activity1();
        
        //build
        thingie.buildList();
        thingie.printPretty();
        
        //shuffle
        thingie.shuffle();
        thingie.printPretty();

        //select sort
        thingie.selectionSort();
        thingie.printPretty();
        
        thingie.selectionSort(true);
        thingie.printPretty();

    }

    @Override
    void buildList() {
        nums = new int[20];
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*121)-20;
        }
    }

    public void printPretty(){
        System.out.println("\n ===== ARRAY ===== (size: " + nums.length + ")");
        for(int num: nums){
            System.out.print(num + " ");
        }
    }

    @Override
    void shuffle() {
       
        //loop thorugh all numbers , index i
        for(int i = 0; i < nums.length; i++){
            //pick random spot, r
            int r = (int)(Math.random()*nums.length);
            // 3 part sawp, r>temp>i
            int temp = nums[i];
            nums[i] = nums[r];
            nums[r] = temp;
        }

    }

    @Override
    void insertionSort() {
       
    }

    void selectionSort(boolean highToLow){
        if(!highToLow){
            selectionSort();
        }
        else{
            for(int o = 0; o < nums.length-1; o++){

            int largest = o;

            for(int i = o+1; i < nums.length; i++){
                if (nums[i]>nums[largest]) {
                    // update the address of the smallest number 
                    largest = i;  
                }
            }
            // after I'm done confirming the smallest address, then I swap
            int temp = nums[largest];
            nums[largest] = nums[o];
            nums[o] = temp;
            
        }
        }
    }

    @Override
    void selectionSort() {
        for(int o = 0; o < nums.length-1; o++){

            int smallest = o;

            for(int i = o+1; i < nums.length; i++){
                if (nums[i]<nums[smallest]) {
                    // update the address of the smallest number 
                    smallest = i;  
                }
            }
            // after I'm done confirming the smallest address, then I swap
            int temp = nums[smallest];
            nums[smallest] = nums[o];
            nums[o] = temp;
            
        }
            
    }

    @Override
    void mergeSort() {
       
    }

    @Override
    int pickRandom() {
        throw new UnsupportedOperationException("Unimplemented method 'pickRandom'");
    }
}
