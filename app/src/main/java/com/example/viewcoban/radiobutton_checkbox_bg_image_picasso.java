package com.example.viewcoban;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class radiobutton_checkbox_bg_image_picasso extends AppCompatActivity {
    Switch swtchwifi;
    LinearLayout linearLayout;
    RadioButton rbtred;
    RadioButton rbtorange;
    RadioButton rbtyellow;
    RadioButton rbtviolet;
    RadioButton rbtgrey;
    RadioGroup radioGroupcolor;
    CheckBox cbandroid;
    CheckBox cbIos;
    CheckBox cbPhp;
    CheckBox cbJava;

    ImageButton ibtClick;
    ArrayList<Integer> arrayListImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobutton_checkbox_bg_image_picasso);
        arrayListImage = new ArrayList<>();
        arrayListImage.add(R.drawable.gaixinh);
        arrayListImage.add(R.drawable.girlxinh2);
        arrayListImage.add(R.drawable.sontit);
        arrayListImage.add(R.drawable.tuyettinhcoc);
        anhxa();
        radioGroupcolor.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId)
                {
                    case R.id.rbtgrey :
                         linearLayout.setBackgroundColor(Color.GRAY);
                         break;
                    case R.id.rbtorange:
                        linearLayout.setBackgroundColor(Color.CYAN);
                        break;
                    case R.id.rbtred:
                        linearLayout.setBackgroundColor(Color.RED);
                        break;
                    case  R.id.rbtviolet:
                        linearLayout.setBackgroundColor(Color.BLUE);
                        break;
                    case R.id.rbtyellow:
                        linearLayout.setBackgroundColor(Color.YELLOW);
                        break;
                }
            }
        });
         cbandroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
             @Override
             public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                 if(isChecked){
                     Toast.makeText(radiobutton_checkbox_bg_image_picasso.this, "Bạn đã chọn android", Toast.LENGTH_SHORT).show();
                 }else{
                     Toast.makeText(radiobutton_checkbox_bg_image_picasso.this, "Bạn đã bỏ chọn android", Toast.LENGTH_SHORT).show();
                 }
             }
         });
        cbJava.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(radiobutton_checkbox_bg_image_picasso.this, "Bạn đã chọn java", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(radiobutton_checkbox_bg_image_picasso.this, "Bạn đã bỏ chọn java", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ibtClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kq = " Bạn Đã Chọn \n ";
                Random rd = new Random();
                if(cbandroid.isChecked()) kq+=cbandroid.getText() + "\n";
                if(cbIos.isChecked()) kq+=cbIos.getText()  + "\n" ;
                if(cbPhp.isChecked()) kq+=cbPhp.getText()  + "\n" ;
                if(cbJava.isChecked()) kq+=cbJava.getText()  + "\n";
                Toast.makeText(radiobutton_checkbox_bg_image_picasso.this, kq, Toast.LENGTH_SHORT).show();
                linearLayout.setBackgroundResource(arrayListImage.get(rd.nextInt(4)));
            }
        });
        swtchwifi.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(radiobutton_checkbox_bg_image_picasso.this, "Bạn đã bật wifi", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(radiobutton_checkbox_bg_image_picasso.this, "Bạn đã tắt wifi", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void anhxa(){
        rbtgrey = (RadioButton) findViewById(R.id.rbtgrey);
        rbtred = (RadioButton) findViewById(R.id.rbtred);
        rbtyellow = (RadioButton) findViewById(R.id.rbtyellow);
        rbtviolet = (RadioButton) findViewById(R.id.rbtviolet);
        rbtorange = (RadioButton) findViewById(R.id.rbtorange);

        cbandroid = (CheckBox) findViewById(R.id.cbandroid);
        cbIos = (CheckBox) findViewById(R.id.cbios);
        cbPhp = (CheckBox) findViewById(R.id.cbphp);
        cbJava = (CheckBox) findViewById(R.id.cbjava);

        ibtClick = (ImageButton) findViewById(R.id.imagebutton);
        linearLayout = (LinearLayout) findViewById(R.id.linear);
        radioGroupcolor = (RadioGroup) findViewById(R.id.nhomradio);
        swtchwifi = (Switch) findViewById(R.id.swwifi);
    }
}
