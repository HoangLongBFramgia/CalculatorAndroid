package hoanglong.framgia.com.calculatorandroid.Present;


import hoanglong.framgia.com.calculatorandroid.Model.Calculator;
import hoanglong.framgia.com.calculatorandroid.View.ICalculatorView;

import static hoanglong.framgia.com.calculatorandroid.Constant.ADD;
import static hoanglong.framgia.com.calculatorandroid.Constant.DIV;
import static hoanglong.framgia.com.calculatorandroid.Constant.MINUS;
import static hoanglong.framgia.com.calculatorandroid.Constant.MULTI;

public class CalculatorPresent implements ICalculatorPresent {

    private ICalculatorView mICalculatorView;

    public CalculatorPresent(ICalculatorView mICalculatorView) {
        this.mICalculatorView = mICalculatorView;
    }

    @Override
    public void onCalculator(int num1, int num2, String operator) {
        Calculator calculator = new Calculator(num1, num2, operator);
        String op = calculator.getOperator();
        int result;
        switch (op) {
            case ADD:
                result = calculator.getNumber1() + calculator.getNumber2();
                mICalculatorView.onShowResult(String.valueOf(result));
                break;
            case MINUS:
                result = calculator.getNumber1() - calculator.getNumber2();
                mICalculatorView.onShowResult(String.valueOf(result));
                break;
            case MULTI:
                result = calculator.getNumber1() * calculator.getNumber2();
                mICalculatorView.onShowResult(String.valueOf(result));
                break;
            case DIV:
                result = calculator.getNumber1() / calculator.getNumber2();
                mICalculatorView.onShowResult(String.valueOf(result));
                break;
        }
    }

    @Override
    public void onShowDisplay(String num) {
        mICalculatorView.showText(num);
    }
}
