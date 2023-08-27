package com.example.calculatorik;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9; // przyciski
    private TextView resultView; // pole tekstowe, w którym będzie wyświetlać się wynik
    private Button buttonDodawanie, buttonOdejmowanie, buttonMnozenie, buttonDzielenie, buttonPrzecinek, buttonCzyszczenie, buttonWynik, buttonZmianaZnaku, buttonModulo; // przyciski
    private String number1, number2, result, operation; // zmienne, w których będziemy przechowywać liczby i wynik


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonModulo = findViewById(R.id.button7);
        buttonModulo.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                number1 = resultView.getText().toString();
                resultView.setText("0");
                operation = "%";
            }
        });

        buttonZmianaZnaku = findViewById(R.id.button16);
        buttonZmianaZnaku.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                if (resultView.getText().toString().contains("-")) {
                    resultView.setText(resultView.getText().toString().replace("-", ""));
                } else {
                    resultView.setText("-" + resultView.getText().toString());
                }
            }
        });

        button0 = findViewById(R.id.button2); // przypisanie przycisku do zmiennej
        button0.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                onClickedNumber(button0.getText().toString());
            }
        });
        button1 = findViewById(R.id.button18); // przypisanie przycisku do zmiennej
        button1.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                onClickedNumber(button1.getText().toString());
            }
        });
        button2 = findViewById(R.id.button12); // przypisanie przycisku do zmiennej
        button2.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                onClickedNumber(button2.getText().toString());
            }
        });
        button3 = findViewById(R.id.button9); // przypisanie przycisku do zmiennej
        button3.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                onClickedNumber(button3.getText().toString());
            }
        });
        button4 = findViewById(R.id.button10); // przypisanie przycisku do zmiennej
        button4.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                onClickedNumber(button4.getText().toString());
            }
        });
        button5 = findViewById(R.id.button11); // przypisanie przycisku do zmiennej
        button5.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                onClickedNumber(button5.getText().toString());
            }
        });
        button6 = findViewById(R.id.button); // przypisanie przycisku do zmiennej
        button6.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                onClickedNumber(button6.getText().toString());
            }
        });
        button7 = findViewById(R.id.button20); // przypisanie przycisku do zmiennej
        button7.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                onClickedNumber(button7.getText().toString());
            }
        });
        button8 = findViewById(R.id.button19); // przypisanie przycisku do zmiennej
        button8.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                onClickedNumber(button8.getText().toString());
            }
        });
        button9 = findViewById(R.id.button8);
        button9.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                onClickedNumber(button9.getText().toString());
            }
        });

        buttonDodawanie = findViewById(R.id.button6);
        buttonDodawanie.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                number1 = resultView.getText().toString();
                resultView.setText("0");
                operation = "+";
            }
        });
        buttonOdejmowanie = findViewById(R.id.button5); // przypisanie przycisku do zmiennej
        buttonOdejmowanie.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                number1 = resultView.getText().toString();
                resultView.setText("0");
                operation = "-";
            }
        });
        buttonMnozenie = findViewById(R.id.button14); // przypisanie przycisku do zmiennej
        buttonMnozenie.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                number1 = resultView.getText().toString();
                resultView.setText("0");
                operation = "*";
            }
        });
        buttonDzielenie = findViewById(R.id.button13); // przypisanie przycisku do zmiennej
        buttonDzielenie.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                number1 = resultView.getText().toString();
                resultView.setText("0");
                operation = "/";
            }
        });

        buttonPrzecinek = findViewById(R.id.button15); // przypisanie przycisku do zmiennej
        buttonPrzecinek.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                if (!resultView.getText().toString().contains(".")) {
                    resultView.setText(resultView.getText() + buttonPrzecinek.getText().toString());
                }
            }
        });
        buttonCzyszczenie = findViewById(R.id.button17); // przypisanie przycisku do zmiennej
        buttonCzyszczenie.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                resultView.setText("0");
            }
        });
        buttonWynik = findViewById(R.id.button4); // przypisanie przycisku do zmiennej
        buttonWynik.setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View v) {
                number2 = resultView.getText().toString();
                switch (operation) {
                    case "+":
                        result = sum(Double.parseDouble(number1), Double.parseDouble(number2)) + "";
                        break;
                    case "-":
                        result = sub(Double.parseDouble(number1), Double.parseDouble(number2)) + "";
                        break;
                    case "*":
                        result = mul(Double.parseDouble(number1), Double.parseDouble(number2)) + "";
                        break;
                    case "/":
                        result = div(Double.parseDouble(number1), Double.parseDouble(number2)) + "";
                        break;
                    case "%":
                        result = modulo(Double.parseDouble(number1), Double.parseDouble(number2)) + "";
                }
                resultView.setText(result);

                number1 = result;
            }
        });
        
        resultView = findViewById(R.id.textView); // przypisanie pola tekstowego do zmiennej

    }

    private void onClickedNumber(String buttonValue) {
        if (resultView.getText().toString().equals("0")) {
            resultView.setText(buttonValue);
        } else {
            resultView.setText(resultView.getText() + buttonValue);
        }
    }

    private double sum(double number1, double number2) {
        return number1 + number2;
    }

    private double sub(double number1, double number2) {
        return number1 - number2;
    }

    private double mul(double number1, double number2) {
        return number1 * number2;
    }

    private double div(double number1, double number2) {
        return number1 / number2;
    }

    private double modulo(double number1, double number2) {
        return number1 % number2;
    }


    @Override
    protected void onStart() {  // to robimy, żeby po włączeniu aplikacji od razu wyświetlał się kalkulator
        super.onStart();
    }
}

