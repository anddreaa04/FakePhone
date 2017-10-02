package edu.upc.eseiaat.pma.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FakePhoneActivity extends AppCompatActivity {

    TextView phonenumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_phone);

        phonenumber = (TextView) findViewById(R.id.number);

       /* String a = "Bond";
        String b = "James";
        String jb = b + a; */
    }

    public void click(View v)
    {
        Button boto = (Button) v;
        String text_boto = boto.getText().toString();
        phonenumber.setText(text_boto);
    }

}
