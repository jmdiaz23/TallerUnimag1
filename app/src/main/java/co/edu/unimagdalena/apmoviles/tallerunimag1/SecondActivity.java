package co.edu.unimagdalena.apmoviles.tallerunimag1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    EditText n1, n2;
    Button suma, resta, multiplicar, division, mayor,mcd,mcm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //poner icono
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        n1= findViewById(R.id.edtn1);
        n2= findViewById(R.id.edtn2);

        suma= findViewById(R.id.btnsumar);
        resta=findViewById(R.id.btnrestar);
        multiplicar=findViewById(R.id.btnmultiplicar);
        division=findViewById(R.id.btndivision);
        mayor=findViewById(R.id.btnmayor);
        mcd=findViewById(R.id.btnmcd);
        mcm=findViewById(R.id.btnmcm);


        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        multiplicar.setOnClickListener(this);
        division.setOnClickListener(this);
        mcd.setOnClickListener(this);
        mayor.setOnClickListener(this);
        mcm.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (n1.length()==0){
            Toast.makeText(this, "Debe ingresar un numero", Toast.LENGTH_SHORT).show();
        }
        if (n2.length()==0){
            Toast.makeText(this, "Debe ingresar un segundo numero", Toast.LENGTH_SHORT).show();
        }
        if (n1.length()!=0 && n2.length()!=0){
            Toast.makeText(this, "Datos en proceso...", Toast.LENGTH_SHORT).show();

            int num1= Integer.parseInt(n1.getText().toString());
            int num2= Integer.parseInt(n2.getText().toString());

            switch (view.getId()){
                case R.id.btnsumar:

                    Toast.makeText(this, "Suma = "+ (num1+num2), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnrestar:

                    Toast.makeText(this, "Resta = "+ (num1-num2), Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnmultiplicar:
                    Toast.makeText(this, "Multiplicar = " + (num1*num2), Toast.LENGTH_SHORT).show();
                    break;

                case R.id.btndivision:

                    if (num2!=0){
                        Toast.makeText(this, "Division = " + (num1/num2), Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(this, "Error...", Toast.LENGTH_SHORT).show();
                    }

                    break;

                case R.id.btnmayor:
                    if (num1>num2){
                        Toast.makeText(this, "Mayor = " + num1, Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(this, "Mayor = " + num2, Toast.LENGTH_SHORT).show();
                    }
                    break;

                case R.id.btnmcd:
                    int min = Math.min(num1, num2);
                    int maximo = 0;
                    for(int i = 1; i <= min; i++){
                        if(num1 % i == 0  && num2 % i == 0){
                            maximo = i;
                        }
                    }
                    Toast.makeText(this, "MCD = " + maximo, Toast.LENGTH_SHORT).show();
                    break;

                case R.id.btnmcm:
                    int minimo = Math.min(num1, num2);
                    int minimocomun = 0;
                    for(int i = 1; i <= minimo; i++){
                        if(num1 % i == 0  && num2 % i == 0){
                            int maximocomun = i;
                            minimocomun = (num1 * num2) / maximocomun;
                        }
                    }
                    Toast.makeText(this, "MCM = " + minimocomun, Toast.LENGTH_SHORT).show();
                    break;


            }

        }




    }
}