package eu.nexume.dimcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonPoint, buttonC, buttonCE, buttonDel, buttonEqual;
    EditText editText;
    TextView resultTv;
    String ACTION;

    double mValueOne = Double.NaN;
    double mValueTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTv = findViewById(R.id.result);
        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonPoint = findViewById(R.id.buttonPoint);
        buttonAdd = findViewById(R.id.buttonadd);
        buttonSub = findViewById(R.id.buttonmin);
        buttonMul = findViewById(R.id.buttonmul);
        buttonDivision = findViewById(R.id.buttondiv);
        buttonC = findViewById(R.id.buttonC);
        buttonCE = findViewById(R.id.buttonCE);
        buttonDel = findViewById(R.id.buttonDel);
        buttonEqual = findViewById(R.id.buttoneql);
        editText = findViewById(R.id.edt);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
                editText.setSelection(editText.getText().length());
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
                editText.setSelection(editText.getText().length());
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
                editText.setSelection(editText.getText().length());
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
                editText.setSelection(editText.getText().length());
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
                editText.setSelection(editText.getText().length());
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
                editText.setSelection(editText.getText().length());
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
                editText.setSelection(editText.getText().length());
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
                editText.setSelection(editText.getText().length());
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
                editText.setSelection(editText.getText().length());
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
                editText.setSelection(editText.getText().length());
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "+";
                if (!Double.isNaN(mValueOne)) {
                    mValueTwo = Double.parseDouble(editText.getText().toString());
                    mValueTwo = mValueOne + mValueTwo;
                } else {
                    if (!editText.getText().toString().isEmpty()) {
                        mValueOne = Double.parseDouble(editText.getText().toString());
                    }
                    resultTv.setText(mValueOne + " + ");
                    editText.setText(null);
                }
            }
        });


        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "-";
                if (!Double.isNaN(mValueOne)) {
                    mValueTwo = Double.parseDouble(editText.getText().toString());
                    mValueTwo = mValueOne - mValueTwo;
                } else {
                    mValueOne = Double.parseDouble(editText.getText().toString());

                }
                resultTv.setText(mValueOne + " - ");
                editText.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "*";
                if (!Double.isNaN(mValueOne)) {
                    mValueTwo = Double.parseDouble(editText.getText().toString());
                    mValueTwo = mValueOne * mValueTwo;
                } else {
                    mValueOne = Double.parseDouble(editText.getText().toString());

                }
                resultTv.setText(mValueOne + " * ");
                editText.setText(null);
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ACTION = "/";
                if (!Double.isNaN(mValueOne)) {
                    mValueTwo = Double.parseDouble(editText.getText().toString());
                    mValueTwo = mValueOne / mValueTwo;
                } else {
                    mValueOne = Double.parseDouble(editText.getText().toString());

                }
                resultTv.setText(mValueOne + " / ");
                editText.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ACTION != null && ACTION.equals("+")) {
                    double result = mValueOne + Double.parseDouble(editText.getText().toString());
                    resultTv.setText(null);
                    editText.setText(String.valueOf(result));
                } else if (ACTION != null && ACTION.equals("-")) {
                    double result = mValueOne - Double.parseDouble(editText.getText().toString());
                    resultTv.setText(null);
                    editText.setText(String.valueOf(result));
                } else if (ACTION != null && ACTION.equals("*")) {
                    double result = mValueOne * Double.parseDouble(editText.getText().toString());
                    resultTv.setText(null);
                    editText.setText(String.valueOf(result));
                } else if (ACTION != null && ACTION.equals("/")) {
                    double result = mValueOne / Double.parseDouble(editText.getText().toString());
                    resultTv.setText(null);
                    editText.setText(String.valueOf(result));
                }

                ACTION = null;

                mValueOne = Double.NaN;

                editText.setSelection(editText.getText().length());

            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Double.NaN;
                editText.setText(null);
                resultTv.setText(null);
            }
        });

        buttonCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(null);
            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = editText.getText().toString();
                if (!number.equals("null") && number.length() > 0) {
                    number = number.substring(0, number.length() - 1);
                }
                editText.setText(number);
                editText.setSelection(editText.getText().length());
            }
        });

        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
                editText.setSelection(editText.getText().length());
            }
        });
    }
}