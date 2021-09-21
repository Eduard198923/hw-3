public class ATM {
    public int countBanknotes(int number) {
        int[] money = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int result = 0;
        int i = 0;
        while(number != 0){
            result +=  number/money[i];
            number = (number % money[i]);
            i++;
        }
        return result;

    }



    public static void main(String[] args) {
        System.out.println(new ATM().countBanknotes(1510));



    }
}
