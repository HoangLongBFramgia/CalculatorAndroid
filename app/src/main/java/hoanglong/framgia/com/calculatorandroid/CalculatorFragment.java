package hoanglong.framgia.com.calculatorandroid;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import hoanglong.framgia.com.calculatorandroid.Present.CalculatorPresent;
import hoanglong.framgia.com.calculatorandroid.Present.ICalculatorPresent;
import hoanglong.framgia.com.calculatorandroid.View.ICalculatorView;

public class CalculatorFragment extends Fragment implements View.OnClickListener, ICalculatorView {

    private RelativeLayout mRelativeOne, mRelativeTwo, mRelativeThree, mRelativeFour,
            mRelativeFive, mRelativeSix, mRelativeSeven, mRelativeEight, mRelativeNine, mRelativeZero;
    private RelativeLayout mRelativeDot, mRelativeResult, mRelativeNegative, mRelativeClearAll,
            mRelativeClear, mRelativeDiary, mRelativePercent, mRelativeDivine, mRelativeMulti,
            mRelativeMinus, mRelativeAdd, mRelativeBracket;
    private EditText mEditTextResult;
    private TextView mTextViewResult;
    private String mCalculator = "";
    private ICalculatorPresent calculatorPresent;

    public CalculatorFragment() {
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calculator, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setView(view);
        setHandleClick();
        calculatorPresent = new CalculatorPresent(this);
        //Hide keyboard edit text
        mEditTextResult.setInputType(InputType.TYPE_NULL);
        mEditTextResult.setInputType(InputType.TYPE_CLASS_NUMBER);
        mEditTextResult.requestFocus();
        InputMethodManager mgr = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.showSoftInput(mEditTextResult, InputMethodManager.SHOW_FORCED);
    }

    private void setHandleClick() {
        mRelativeZero.setOnClickListener(this);
        mRelativeOne.setOnClickListener(this);
        mRelativeTwo.setOnClickListener(this);
        mRelativeThree.setOnClickListener(this);
        mRelativeFour.setOnClickListener(this);
        mRelativeFive.setOnClickListener(this);
        mRelativeSix.setOnClickListener(this);
        mRelativeSeven.setOnClickListener(this);
        mRelativeEight.setOnClickListener(this);
        mRelativeNine.setOnClickListener(this);
        mRelativeResult.setOnClickListener(this);
        mRelativeAdd.setOnClickListener(this);
        mRelativeMinus.setOnClickListener(this);
        mRelativeMulti.setOnClickListener(this);
        mRelativeDivine.setOnClickListener(this);
        mRelativeDot.setOnClickListener(this);
        mRelativeNegative.setOnClickListener(this);
        mRelativePercent.setOnClickListener(this);
        mRelativeBracket.setOnClickListener(this);
        mRelativeClear.setOnClickListener(this);
        mRelativeClearAll.setOnClickListener(this);
        mRelativeDiary.setOnClickListener(this);
    }

    private void setView(View view) {
        mRelativeZero = view.findViewById(R.id.rl_0);
        mRelativeOne = view.findViewById(R.id.rl_1);
        mRelativeTwo = view.findViewById(R.id.rl_2);
        mRelativeThree = view.findViewById(R.id.rl_3);
        mRelativeFour = view.findViewById(R.id.rl_4);
        mRelativeFive = view.findViewById(R.id.rl_5);
        mRelativeSix = view.findViewById(R.id.rl_6);
        mRelativeSeven = view.findViewById(R.id.rl_7);
        mRelativeEight = view.findViewById(R.id.rl_8);
        mRelativeNine = view.findViewById(R.id.rl_9);
        mRelativeNegative = view.findViewById(R.id.rl_negative);
        mRelativeDot = view.findViewById(R.id.rl_dot);
        mRelativeResult = view.findViewById(R.id.rl_result);
        mRelativeAdd = view.findViewById(R.id.rl_add);
        mRelativeMinus = view.findViewById(R.id.rl_minus);
        mRelativeMulti = view.findViewById(R.id.rl_multiply);
        mRelativeDivine = view.findViewById(R.id.rl_divide);
        mRelativePercent = view.findViewById(R.id.rl_percent);
        mRelativeBracket = view.findViewById(R.id.rl_bracket);
        mRelativeClearAll = view.findViewById(R.id.rl_clear_all);
        mRelativeClear = view.findViewById(R.id.rl_clear);
        mRelativeDiary = view.findViewById(R.id.rl_diary);
        mEditTextResult = view.findViewById(R.id.et_result);
        mTextViewResult = view.findViewById(R.id.tv_result);
    }

    @Override
    public void showText(String text) {
        mCalculator += text;
        mEditTextResult.setText(mCalculator);
        mEditTextResult.setSelection(mEditTextResult.getText().length());
    }

    @Override
    public void onShowResult(String result) {
        mTextViewResult.setText(result);
    }

    @Override
    public void onClick(View v) {
        String mInputText = mEditTextResult.getText().toString();
        switch (v.getId()) {
            case R.id.rl_0:
                calculatorPresent.onShowDisplay(String.valueOf(Constant.CONST_ZERO));
                break;
            case R.id.rl_1:
                calculatorPresent.onShowDisplay(String.valueOf(Constant.CONST_ONE));
                break;
            case R.id.rl_2:
                calculatorPresent.onShowDisplay(String.valueOf(Constant.CONST_TWO));
                break;
            case R.id.rl_3:
                calculatorPresent.onShowDisplay(String.valueOf(Constant.CONST_THREE));
                break;
            case R.id.rl_4:
                calculatorPresent.onShowDisplay(String.valueOf(Constant.CONST_FOUR));
                break;
            case R.id.rl_5:
                calculatorPresent.onShowDisplay(String.valueOf(Constant.CONST_FIVE));
                break;
            case R.id.rl_6:
                calculatorPresent.onShowDisplay(String.valueOf(Constant.CONST_SIX));
                break;
            case R.id.rl_7:
                calculatorPresent.onShowDisplay(String.valueOf(Constant.CONST_SEVEN));
                break;
            case R.id.rl_8:
                calculatorPresent.onShowDisplay(String.valueOf(Constant.CONST_EIGHT));
                break;
            case R.id.rl_9:
                calculatorPresent.onShowDisplay(String.valueOf(Constant.CONST_NINE));
                break;
            case R.id.rl_negative:
                break;
            case R.id.rl_dot:
                break;
            case R.id.rl_result:
                if (mInputText.contains(getString(R.string.operator_add))) {
                    calculatorPresent.onCalculator(Constant.CONST_ONE, Constant.CONST_ONE, getString(R.string.add));
                } else if (mInputText.contains(getString(R.string.operator_minus))) {
                    calculatorPresent.onCalculator(Constant.CONST_ONE, Constant.CONST_ONE, getString(R.string.minus));
                } else if (mInputText.contains(getString(R.string.operator_multi))) {
                    calculatorPresent.onCalculator(Constant.CONST_ONE, Constant.CONST_ONE, getString(R.string.mutil));
                } else if (mInputText.contains(getString(R.string.operator_div))) {
                    calculatorPresent.onCalculator(Constant.CONST_ONE, Constant.CONST_ONE, getString(R.string.div));
                }
                break;
            case R.id.rl_add:
                if (mCalculator.length() > 0) {
                    calculatorPresent.onShowDisplay(Constant.OPERATOR_ADD);
                }
                break;
            case R.id.rl_minus:
                if (mCalculator.length() > 0) {
                    calculatorPresent.onShowDisplay(Constant.OPERATOR_MINUS);
                }
                break;
            case R.id.rl_multiply:
                if (mCalculator.length() > 0) {
                    calculatorPresent.onShowDisplay(Constant.OPERATOR_MULTI);
                }
                break;
            case R.id.rl_divide:
                if (mCalculator.length() > 0) {
                    calculatorPresent.onShowDisplay(Constant.OPERATOR_DIV);
                }
                break;
            case R.id.rl_percent:
                break;
            case R.id.rl_bracket:
                break;
            case R.id.rl_clear:
                break;
            case R.id.rl_clear_all:
                break;
            case R.id.rl_diary:
                break;
        }
    }

}
