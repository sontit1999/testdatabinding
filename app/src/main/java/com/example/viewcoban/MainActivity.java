package com.example.viewcoban;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView Tvname;
    RadioButton rbtgay;
    RadioButton rbtless;
    CheckBox cbmautim;
    CheckBox cbmauhong;
    CheckBox cbnoitam;
    CheckBox cbkhoctham;
    ImageButton imgbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        imgbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = Tvname.getText().toString().trim();
                if(rbtless.isChecked()){
                    name = name + " la " + "less" ;
                }else{
                    name = name + " la " + "gay" ;
                }
                if(cbmautim.isChecked())
                {
                    name = name + " co so thic la " + cbmautim.getText() + ", ";
                }
                if(cbmauhong.isChecked())
                {
                    name = name + cbmauhong.getText() + ", " ;
                }
                if(cbkhoctham.isChecked())
                {
                    name = name + cbkhoctham.getText();
                }
                if(cbnoitam.isChecked())
                {
                    name = name + " va " + cbnoitam.getText();
                }
                Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
            }
        });


    }
    public void anhxa()
    {
        Tvname = (TextView) findViewById(R.id.tv_name);
        rbtgay = (RadioButton) findViewById(R.id.rbtn_gay);
        rbtless = (RadioButton) findViewById(R.id.rbtn_less);
        cbmautim = (CheckBox) findViewById(R.id.cb_mautim);
        cbmauhong = (CheckBox) findViewById(R.id.cb_mauhong);
        cbnoitam = (CheckBox) findViewById(R.id.cb_noitam);
        cbkhoctham = (CheckBox) findViewById(R.id.cb_khoctham);
        imgbt = (ImageButton) findViewById(R.id.img_button);
    }
}
