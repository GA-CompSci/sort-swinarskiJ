public class Activity1 extends IntegerManager implements PrintPretty{
    public static void main(String[] args) throws Exception {
        Activity1 thingie = new Activity1();
        thingie.buildList();
        thingie.printPretty();
        thingie.shuffle();
        thingie.selectionSort();
    }

    @Override
    void buildList() {
        nums = new int[20];
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*100);
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

        System.out.println("\n ===== SHUFFLED ARRAY ===== (size: " + nums.length + ")");
        for(int num: nums){
            System.out.print(num + " ");
        }
            
    }

    @Override
    void insertionSort() {
       
    }

    @Override
    void selectionSort() {
        int i,j,temp;
        for (i = 0; i < nums.length; i++){
            int smallest = i;

            for(j = i+1; j <nums.length; j++){
                if(nums[j]<nums[smallest]){
                    smallest = j;
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
            }
        }
            
            
        }

        System.out.println("\n ===== SELECT-SORTED ARRAY (NOT DONE) ===== (size: " + nums.length + ")");
        for(int num: nums){
            System.out.print(num + " ");
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
