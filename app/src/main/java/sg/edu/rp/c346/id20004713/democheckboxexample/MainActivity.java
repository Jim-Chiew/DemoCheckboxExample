package sg.edu.rp.c346.id20004713.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cbDiscount;
    Button btnCheck;
    TextView tvOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbDiscount = findViewById(R.id.cbDiscount);
        btnCheck = findViewById(R.id.btnCheck);
        tvOutput = findViewById(R.id.tvOutput);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbDiscount.isChecked()){
                    tvOutput.setText("Discount is given");
                    cbDiscount.setChecked(false);
                } else {
                    tvOutput.setText("Discount is not given");
                    cbDiscount.setChecked(true);
                }

                Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_SHORT).show();
            }
        });
    }
}