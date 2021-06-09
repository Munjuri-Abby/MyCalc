    package com.example.kalc;

    import android.annotation.SuppressLint;
    import android.os.Bundle;
    import android.view.View;
    import android.widget.Button;
    import android.widget.TextView;

    import androidx.appcompat.app.AppCompatActivity;

    import javax.script.ScriptEngine;
    import javax.script.ScriptEngineManager;
    import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {
    private TextView input,output;
    private Button one, two, three, four, five, six, seven, eight, nine, zero, dot, clear, add, minus, multiply, divide, delete, mod, equal, factorial;
    private String Input, Result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id. input);
        output = findViewById(R.id. output);
        one = findViewById(R.id. one );
        two = findViewById(R.id. two);
        three = findViewById(R.id. three );
        four = findViewById(R.id. four);
        five = findViewById(R.id. five );
        six = findViewById(R.id. six);
        seven = findViewById(R.id. seven );
        eight = findViewById(R.id. eight);
        nine = findViewById(R.id. nine );
        zero = findViewById(R.id. zero);
        dot = findViewById(R.id. dot );
        clear = findViewById(R.id. clear);
        add = findViewById(R.id. add );
        minus = findViewById(R.id. minus);
        multiply = findViewById(R.id. multiply );
        divide = findViewById(R.id. divide);
        delete = findViewById(R.id. delete);
        mod = findViewById(R.id. mod);
        equal = findViewById(R.id.equal);
        factorial = findViewById(R.id.factorial);

        one.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+ "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+".");
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText("");
                output.setText("");
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0){
                    input.setText(" ");
                }
                if(output.getText().toString().length()==0){
                    output.setText(" ");
                }
                String val = input.getText().toString();
                val = val.substring(0, val.length() - 1);
                input.setText(val);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"+");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"-");
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"*");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"/");
            }
        });
        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(input.getText().toString());
                int fact = factorial(val);
                output.setText(String.valueOf(fact));
                input.setText(val+"!");
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText()+"%");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().toString().length()==0){
                    input.setText("0");
                }
                String outputs = input.getText().toString();
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
        try {
            double result = (double) engine.eval(outputs);
            output.setText(result+"");

        } catch (ScriptException e) {

                    }
            }
        });


    }

    int factorial(int n){
        return (n==1 || n==0)? 1:n*factorial(n-1);
    }

}