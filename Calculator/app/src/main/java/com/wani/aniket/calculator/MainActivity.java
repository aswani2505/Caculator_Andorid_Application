package com.wani.aniket.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button add;
    private Button sub;
    private Button mult;
    private Button div;
    private Button clr;
    private TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operand1 = (EditText) findViewById(R.id.editText);
        operand2 = (EditText) findViewById(R.id.editText2);
        add = (Button) findViewById(R.id.button);
        sub = (Button) findViewById(R.id.button2);
        mult = (Button) findViewById(R.id.button3);
        div = (Button) findViewById(R.id.button4);
        clr = (Button) findViewById(R.id.button5);
        Result =(TextView) findViewById(R.id.textView2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)){
                    double opr1,opr2,res;
                    opr1 = Double.parseDouble(operand1.getText().toString());
                    opr2 = Double.parseDouble(operand2.getText().toString());
                    res = opr1 + opr2;
                    Result.setText(Double.toString(res));
                }else{
                    Toast.makeText(MainActivity.this, "Please Enter numbers in both the fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((operand1.getText().length()>0) && (operand2.getText().length()>0)){
                    double opr1,opr2,res;
                    opr1 = Double.parseDouble(operand1.getText().toString());
                    opr2 = Double.parseDouble(operand2.getText().toString());
                    res = opr1 - opr2;
                    Result.setText(Double.toString(res));
                }else{
                    Toast.makeText(MainActivity.this, "Please Enter numbers in both the fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    double opr1, opr2, res;
                    opr1 = Double.parseDouble(operand1.getText().toString());
                    opr2 = Double.parseDouble(operand2.getText().toString());
                    res = opr1 * opr2;
                    Result.setText(Double.toString(res));
                } else {
                    Toast.makeText(MainActivity.this, "Please Enter numbers in both the fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0)) {
                    double opr1, opr2, res;
                    opr1 = Double.parseDouble(operand1.getText().toString());
                    opr2 = Double.parseDouble(operand2.getText().toString());
                    res = opr1 / opr2;
                    Result.setText(Double.toString(res));
                } else {
                    Toast.makeText(MainActivity.this, "Please Enter numbers in both the fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operand1.setText("");
                operand2.setText("");
                Result.setText("0.00");
                operand1.requestFocus();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
