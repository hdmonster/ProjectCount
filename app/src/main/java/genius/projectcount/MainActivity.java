package genius.projectcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtBindo;
    private EditText edtMetik;
    private EditText edtIpa;
    private Button btnCount;
    private TextView txtNem, txtRata, txtPre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Count Nilai");

        edtBindo = (EditText) findViewById(R.id.edt_bindo);
        edtMetik = (EditText) findViewById(R.id.edt_metik);
        edtIpa = (EditText) findViewById(R.id.edt_ipa);

        btnCount = (Button) findViewById(R.id.btn_hitung);
        txtNem = (TextView) findViewById(R.id.txt_nem);
        txtRata = (TextView) findViewById(R.id.txt_mean);
        txtPre = (TextView) findViewById(R.id.txtPred);

        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bi = edtBindo.getText().toString().trim();
                String metik = edtMetik.getText().toString().trim();
                String ipa = edtIpa.getText().toString().trim();


                double i = Double.parseDouble(bi);
                double m = Double.parseDouble(metik);
                double s = Double.parseDouble(ipa);

                double Nem = i + m + s;
                txtNem.setText("Nem :" +Nem );

                double mean = (Nem / 3);
                txtRata.setText("Mean:" +mean);

                if(mean >9){
                    txtPre.setText("Akreditasi: A");
                }else if(mean >7.5){
                    txtPre.setText("Akreditasi: B");
                }else if(mean >6){
                    txtPre.setText("Akreditasi: C");
                }else{
                    txtPre.setText("Akreditasi: D");
                }

            }

        });
    }
}
