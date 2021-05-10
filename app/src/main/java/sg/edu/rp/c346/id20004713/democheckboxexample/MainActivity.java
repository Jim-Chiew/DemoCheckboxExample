package sg.edu.rp.c346.id20004713.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
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
                Log.i("MyActivity", "Inside onClick()");
                Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_SHORT).show();

                if(cbDiscount.isChecked()) {
                    double pay = calcPay(100, 20);
                    tvOutput.setText("The discount is given. You need to pay " + pay);
                }
                else {
                    double pay = calcPay(100, 0);
                    tvOutput.setText("The discount is not given. You need to pay " + pay);
                }



            }
        });
    }

    private double calcPay(double price, double discount){
        double pay = price * (1 - discount / 100);
        return pay;
    }
}