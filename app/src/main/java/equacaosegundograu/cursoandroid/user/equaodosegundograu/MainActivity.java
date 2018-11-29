package equacaosegundograu.cursoandroid.user.equaodosegundograu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText numberA;
    private EditText numberB;
    private EditText numberC;
    private Button calcular;
    private TextView x1;
    private TextView x2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberA = findViewById(R.id.textAId);
        numberB = findViewById(R.id.textBId);
        numberC = findViewById(R.id.textCId);
        calcular = findViewById(R.id.calcularId);
        x1 = findViewById(R.id.x1Id);
        x2 = findViewById(R.id.x2Id);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String A = numberA.getText().toString();
                String B = numberB.getText().toString();
                String C = numberC.getText().toString();

                double VA=Double.parseDouble(A);
                double VB=Double.parseDouble(B);
                double VC=Double.parseDouble(C);

                double delta = (VB*VB)-4*VA*VC;
                if(delta < 0){
                    Toast.makeText(getApplicationContext(),"Delta menor que zero",Toast.LENGTH_LONG).show();
                    x1.setText("");
                    x2.setText("");
                }else{
                    double X1 = (-VB + Math.sqrt(delta))/(2*VA);
                    double X2 = (-VB - Math.sqrt(delta))/(2*VA);

                    x1.setText("X1 = "+X1);
                    x2.setText("X2 = "+X2);
                }
            }
        });


    }
}
