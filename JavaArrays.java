public class JavaArrays {

    public static void main(String[] args) {
        int[] myNumbers = createNumberArray();
        printArray(myNumbers);
    }

    private static int[] createNumberArray(){
        int[] numbers = new int[3];
//        int[] numbers = {5,2,3};
//
//        numbers[0] = 7;

        numbers[0] = 5;
        numbers[1] = 2;
        numbers[2] = 3;

        return numbers;
    }

    private static void printArray(int[] toPrint){
        for(int i = 0; i < toPrint.length; i++){
            System.out.println(toPrint[i]);
        }
    }

}
