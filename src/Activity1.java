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
       //thingie.selectionSort();
       // thingie.printPretty();
        
       //thingie.selectionSort(true);
        //thingie.printPretty();

        //insert sort
        //thingie.insertionSort();
        //thingie.printPretty();
        
       //thingie.insertionSort(true);
       //thingie.printPretty();

       thingie.pickRandom();

       //binary
       //thingie.selectionSort(); //for organization
       //thingie.printPretty();
       //thingie.binarySearch(34);


       //merge
       thingie.mergeSort(thingie.nums);
       thingie.printPretty();



    }



    @Override
    void buildList() {
        nums = new int[20];
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*90)-20;
        }
    }

    public void printPretty(){
        System.out.println("\n ===== ARRAY ===== (size: " + nums.length + ")");
        for(int num: nums){
            System.out.print(num + " ");
        }
        //adds space bewtween sorts
        System.out.println();
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
       
        for(int j = 1; j<nums.length; j++){
        //backwards while loop    
            int temp = nums[j];
            int i = j-1;
            
            while(i>-1 && nums[i] > temp){
                //shift
                nums[i+1] = nums[i];
                i--;
            }

            nums[i+1] = temp; //complete swap

            //verbose
            System.out.println("\n \n \n INSERTION PASS #" + j);
            printPretty();;
       }
    }

    void insertionSort(boolean highToLow) {
        if(!highToLow){
            insertionSort();
        }
        else{
            for(int j = 1; j<nums.length; j++){
            //backwards while loop    
                int i = j-1;
                int temp = nums[j];
                
                
                while(i>-1 && nums[i] < temp){
                    //shift
                    nums[i+1] = nums[i];
                    i--;
                }

                nums[i+1] = temp; //complete swap
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
    void mergeSort(int[] nums) {
       int n = nums.length;
        //base case
        if (n<= 1) return;

        //split
        int mid = n/2;
        int[] l = new int[mid];
        int[] r = new int[n-mid];

        for(int i = 0; i<mid; i++){
            l[i] = nums[i];
        }
        for(int i = mid; i<n; i++){
            r[i-mid] = nums[i];
        }

        mergeSort(l);
        mergeSort(r);

        //can't work until base case hits
        merge(nums, l, r, mid, n-mid);

    }

    void merge(int[] nums, int[] l, int[] r, int left, int right){
        // i = left     j = right       k = nums
        int i = 0, j = 0, k= 0;

        while(i<left && j<right){
            if(l[i]<=r[j]){
                nums[k++] = l[i++];
            }
            else{
                nums[k++] = r[j++];
            }
        }
        while (i<left) nums[k++] = l[i++];  // only left remaining
        while (j<right) nums[k++] = r[j++]; // only right remaining
    }


    @Override
    int pickRandom() {
        int i = (int)(Math.random()*nums.length);
        int picked = nums[i];
        System.out.println("\nChosen number: "+picked+ " (index "+ i+")");
        return picked;
    }


    
    int binarySearch(int target){
        
        int low= 0;
        int high = nums.length-1;
        //start middle

        while (low<= high) { 
            int mid = (low+high)/2;
            //equal to target
            if(nums[mid] == target) {
                System.out.println("!! Target (" + target +") has been found !! ");
                return mid;
            }

            //more than target
            else if (nums[mid] > target) {
                high = mid-1;
            }
            //less than target
            else if (nums[mid] < target){
                low = mid+1;
            }
            
            }
            //if I couldn't find what I looked for
            System.out.println("?? Target ("+target+") not found. ??");
            return -1;
    }


}
