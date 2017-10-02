package edu.upc.eseiaat.pma.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FakePhoneActivity extends AppCompatActivity {

    TextView phonenumber;
    private String aux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_phone);

        phonenumber = (TextView) findViewById(R.id.number);
        aux= ""; /*INICIALITZEM LA VARIABLE*/
       /* String a = "Bond";
        String b = "James";
        String jb = b + a; */
    }


    public void click(View v)
    {
        Button boto = (Button) v;
        String text_boto = boto.getText().toString();
        aux = aux + text_boto;
        /*phonenumber.getText(text_boto);*/
       phonenumber.setText(aux);
    }
    public void borrar (View v){
        Button borrado = (Button) v;
        aux= "";
        phonenumber.setText(aux);
    }
    public void llamar (View v){
        Button llamando = (Button) v;
        aux= "llamando al "+aux;
        Toast.makeText(FakePhoneActivity.this, aux, Toast.LENGTH_SHORT).show();
        aux= "";
        
    }

}
