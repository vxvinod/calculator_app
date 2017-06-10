package example.org.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button add;
    private Button subract;
    private Button multiply;
    private Button reset;

    private TextView result;
    private EditText number1;
    private EditText number2;
    private Integer a;
    private Integer b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add = (Button) findViewById(R.id.add);
        subract = (Button) findViewById(R.id.subract);
        multiply = (Button) findViewById(R.id.multiply);
        number1 = (EditText) findViewById(R.id.number1);
        number2 = (EditText) findViewById(R.id.number2);
        reset  = (Button) findViewById(R.id.reset);
        result = (TextView) findViewById(R.id.result);

        View.OnClickListener addOnClick = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                a = Integer.valueOf(number1.getText().toString());
                b = Integer.valueOf(number2.getText().toString());
                a= a+b;
                result.setText(a.toString());
            }
        };
        View.OnClickListener subractOnClick = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                a = Integer.valueOf(number1.getText().toString());
                b = Integer.valueOf(number2.getText().toString());
                a= a-b;
                result.setText(a.toString());
            }
        };
        View.OnClickListener multiplyOnClick = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                a = Integer.valueOf(number1.getText().toString());
                b = Integer.valueOf(number2.getText().toString());
                a= a*b;
                result.setText(a.toString());
            }
        };
        View.OnClickListener resetOnClick = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                number1.setText("");
                number2.setText("");
                result.setText("");
            }
        };

        add.setOnClickListener(addOnClick);
        subract.setOnClickListener(subractOnClick);
        multiply.setOnClickListener(multiplyOnClick);
        reset.setOnClickListener(resetOnClick);

    }
}
