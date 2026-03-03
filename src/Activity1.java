public class Activity1 extends IntegerManager implements PrintPretty{
    public static void main(String[] args) throws Exception {
        Activity1 thingie = new Activity1();
        thingie.buildList();
        thingie.printPretty();
    }

    @Override
    void buildList() {
        nums = new int[20];
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)(Math.random()*1000) - 100;
        }
    }

    public void printPretty(){
        System.out.println("/n ===== ARRAY ===== (size: " + nums.length + ")");
        for(int num: nums){
            System.out.print(num + " ");
        }
    }

    @Override
    void shuffle() {
        //loop thorugh all numbers , index i
            //pick random spot, r
            // 3 part sawp, r>temp>i
    }

    @Override
    void insertionSort() {
       
    }

    @Override
    void selectionSort() {

    }

    @Override
    void mergeSort() {
       
    }

    @Override
    int pickRandom() {
        throw new UnsupportedOperationException("Unimplemented method 'pickRandom'");
    }
}
