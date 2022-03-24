package com.kshitija.cal0;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Animatable2;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    TextView txtinput;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnadd, btnsub, btnmul, btndiv, btnequal, btnclear;
    Float num1, num2;
    boolean add, sub, mul, div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtinput = findViewById(R.id.txtinput);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);
        btnequal = findViewById(R.id.btnequal);
        btnclear = findViewById(R.id.btnclear);

        btn1.setOnClickListener(new btn1ClickListener());
        btn2.setOnClickListener(new btn2ClickListener());
        btn3.setOnClickListener(new btn3ClickListener());
        btn4.setOnClickListener(new btn4ClickListener());
        btn5.setOnClickListener(new btn5ClickListener());
        btn6.setOnClickListener(new btn6ClickListener());
        btn7.setOnClickListener(new btn7ClickListener());
        btn8.setOnClickListener(new btn8ClickListener());
        btn9.setOnClickListener(new btn9ClickListener());
        btn0.setOnClickListener(new btn0ClickListener());
        btnadd.setOnClickListener(new btnaddClickListener());
        btnsub.setOnClickListener(new btnsubClickListener());
        btnmul.setOnClickListener(new btnmulClickListener());
        btndiv.setOnClickListener(new btndivClickListener());
        btnequal.setOnClickListener(new btnequalClickListener());
        btnclear.setOnClickListener(new btnclearClickListener());
    }

    private class btn1ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            txtinput.setText(txtinput.getText() + "1");
        }
    }

    private class btn2ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            txtinput.setText(txtinput.getText() + "2");
        }
    }

    private class btn3ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            txtinput.setText(txtinput.getText() + "3");
        }
    }

    private class btn4ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            txtinput.setText(txtinput.getText() + "4");
        }
    }

    private class btn5ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            txtinput.setText(txtinput.getText() + "5");
        }
    }

    private class btn6ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            txtinput.setText(txtinput.getText() + "6");
        }
    }

    private class btn7ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            txtinput.setText(txtinput.getText() + "7");
        }
    }

    private class btn8ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            txtinput.setText(txtinput.getText() + "8");
        }
    }

    private class btn9ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            txtinput.setText(txtinput.getText() + "9");
        }
    }

    private class btn0ClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            txtinput.setText(txtinput.getText() + "0");
        }
    }

    private class btnaddClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (txtinput == null) {
                txtinput.setText("");
            } else {
                num1 = Float.parseFloat(txtinput.getText() + "");
                add = true;
                txtinput.setText(null);
            }
        }
    }

    private class btnsubClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            num1 = Float.parseFloat(txtinput.getText() + "");
            sub = true;
            txtinput.setText(null);
        }
    }

    private class btnmulClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            num1 = Float.parseFloat(txtinput.getText() + "");
            mul = true;
            txtinput.setText(null);
        }
    }

    private class btndivClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            num1 = Float.parseFloat(txtinput.getText() + "");
            div = true;
            txtinput.setText(null);
        }
    }

    private class btnequalClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            num2 = Float.parseFloat(txtinput.getText() + "");

            if (add == true) {
                txtinput.setText(num1 + num2 + "");
                add = false;
            }
            if (sub == true) {
                txtinput.setText(num1 - num2 + "");
                sub = false;
            }
            if (mul == true) {
                txtinput.setText(num1 * num2 + "");
                mul = false;
            }
            if (div == true) {
                txtinput.setText(num1 / num2 + "");
                div = false;
            }
        }
    }

    private class btnclearClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            txtinput.setText("");
        }
    }
}


