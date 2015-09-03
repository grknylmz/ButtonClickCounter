package com.example.gurkanyilmaz.buttonclickcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText operand1;
    EditText operand2;
    Button btnPlus;
    Button btnMinus;
    Button btnMultiply;
    Button btnDivide;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // Operands created in runtime.
        
        operand1 = (EditText)findViewById(R.id.editOperand1);
        operand2 = (EditText)findViewById(R.id.editOperand2);

        // Associate buttons.
        
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnDivide = (Button) findViewById(R.id.btnDivide);

        //Associate result Textfield

        result = (TextView) findViewById(R.id.result);

        btnPlus.hasOnClickListeners(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float oper1 = Float.parseFloat(operand1.getText().toString());
                float oper2 = Float.parseFloat(operand2.getText().toString());

                float theResult = operand1 + operand2;

                //Todo 249
            }
        }){
        }
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
