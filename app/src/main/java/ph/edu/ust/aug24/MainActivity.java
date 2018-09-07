package ph.edu.ust.aug24;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button resultB = (Button) findViewById(R.id.submitButton);

        resultB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                /*EditText num1 = (EditText) findViewById(R.id.editNum1);
                EditText num2 = (EditText) findViewById(R.id.editNum2);*/
                TextView resultView = (TextView) findViewById(R.id.textResult);
                /*int firstnum = Integer.parseInt(num1.getText().toString());
                int secondnum = Integer.parseInt(num2.getText().toString());
                int sum = firstnum + secondnum;*/

                String result = "";

                for (int i = 0; i <= 20; i += 2) {
                    result += Integer.toString(i) + "  ";
                }

                resultView.setText(result);
            }

            });
    }
}
