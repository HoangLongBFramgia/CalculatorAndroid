package hoanglong.framgia.com.calculatorandroid.Model;

public class Calculator implements ICalculator {

    private int mNumber1;
    private int mNumber2;
    private String mOperator;

    public Calculator(int mNumber1, int mNumber2, String mOperator) {
        this.mNumber1 = mNumber1;
        this.mNumber2 = mNumber2;
        this.mOperator = mOperator;
    }

    @Override
    public int getNumber1() {
        return mNumber1;
    }

    @Override
    public int getNumber2() {
        return mNumber2;
    }

    @Override
    public String getOperator() {
        return mOperator;
    }
}
