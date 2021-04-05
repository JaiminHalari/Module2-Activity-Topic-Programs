package james.my.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_I4_Jaimin extends AppCompatActivity {

    EditText edit_firstvalue,edit_secondvalue;
    Button sumbutton;
    MainActivity mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__i4__jaimin);

        edit_firstvalue = findViewById(R.id.firstvalue_id);
        edit_secondvalue = findViewById(R.id.secondvalue_id);
        sumbutton = findViewById(R.id.sum_id);

        mainActivity = new MainActivity();

        sumbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(edit_firstvalue.getText().toString());
                int second = Integer.parseInt(edit_secondvalue.getText().toString());
                int Sumvalue = first + second;

                Log.d("addition", String.valueOf(Sumvalue));
                Intent intent = new Intent(Activity_I4_Jaimin.this,MainActivity.class);
                intent.putExtra("add",String.valueOf(Sumvalue));
                Log.d("additionsend", String.valueOf(Sumvalue));
                startActivity(intent);

            }
        });

    }
}