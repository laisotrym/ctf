package vn.cmc.chl1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    TextView flagValue;
    Button button;
    int i =0;
    String lbl_url;
    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        flagValue = findViewById(R.id.flagValue);
        button = findViewById(R.id.button);
        int d1 = b.checkAppSignature(this);
        msg = "The Flag is: ";
        if(d1 < 1){
            Toast.makeText(this,"App Damaged",Toast.LENGTH_LONG).show();
            this.finishAffinity();
        }
        lbl_url = "java{old_but_";
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i +=1;
                if(i == 10){
                    Toast.makeText(MainActivity.this,"Oh, flag correct but incomplete.",Toast.LENGTH_SHORT).show();
                    i = 0;
                }else if(i == 3){
                    flagValue.setText(msg+ lbl_url);
                }

            }
        });

        F f = new F();
        f.setFlag("Fdg0CHO3cpzwjbMK2");
        f.setFlag("WDleojxp6Hzp5kW4r");
        f.setFlag("YIY4ghsm2dhJS5XXS");
        f.setFlag("RtUen0GuqhUmDFQpj");
        f.setFlag("iGlzD6OiiUuSq0L9A");
        f.setFlag("OHCCVXIbSmqTlIO7h");
    }
}
