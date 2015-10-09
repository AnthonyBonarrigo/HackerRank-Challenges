public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int numOfTests = input.nextInt();
        int currentTest = 1;
        
        while(currentTest <= numOfTests){
            int number = input.nextInt();
            for (int i = 0; i < number; i++){
                (i % 3 == 0 || i % 5 == 0) ? sum += i : continue; 
            }
            System.out.println(sum);
            currentTest++;
            //reset sum
            sum = 0;
        }
    }
}
