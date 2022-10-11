public class Denominations {

    int denominations[] = {2000, 500, 200, 50, 20, 10, 5, 2, 1};
    int numberOfCurrency[] = new int[10];
    int amount;

    public Denominations(int amount){
        this.amount = amount;
    }


    public int[] getDenominations() {
        return denominations;
    }

    public int[] getNumberOfCurrency(){
        numberOfCurrency = calculateNumber(this.amount);
        return numberOfCurrency;
    }

    private int[] calculateNumber(int amount) {
        for(int i=0; i<9; i++){
                if(amount>=denominations[i] && amount > 0){
                    numberOfCurrency[i] = amount/denominations[i];
                    amount=amount%denominations[i];
                }
        }
        return numberOfCurrency;
    }
}