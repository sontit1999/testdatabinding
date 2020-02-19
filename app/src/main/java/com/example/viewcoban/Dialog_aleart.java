package com.example.viewcoban;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.database.DatabaseUtils;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.viewcoban.databinding.ActivityDialogAleartBinding;
import com.squareup.picasso.Picasso;

public class Dialog_aleart extends AppCompatActivity {
    ActivityDialogAleartBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_dialog_aleart);


        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.get().load("https://1.bp.blogspot.com/-ydS25hMYkRc/WLYeGBpYpjI/AAAAAAAAADA/V7N5F2l7vQoNh_th5N--UPVKScdbjEj4gCLcB/s1600/G%2B%25281%2529.jpg").into(binding.imageView);
            }
        });
    }
}
