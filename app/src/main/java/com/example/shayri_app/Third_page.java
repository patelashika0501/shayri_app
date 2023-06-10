package com.example.shayri_app;

import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetDialog;

public class Third_page extends AppCompatActivity
{
    TextView textView,index;
    ImageView img1,img2,img3,back,next,copy,share;
    String ss[];
    int a=0,count=0,i,cnt=0,z=1;

    GridView gridView;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_page);
        textView = findViewById(R.id.shayri);
        ss = getIntent().getStringArrayExtra("shayri");
        int position = getIntent().getIntExtra("position",0);
        img1 = findViewById(R.id.thirdimg1);
        img2 = findViewById(R.id.thirdimg2);
        img3 = findViewById(R.id.thirdimg3);
        copy = findViewById(R.id.copyicon);
        back = findViewById(R.id.backbutton);
        next = findViewById(R.id.nextbutton);
        share = findViewById(R.id.shareicon);
        index =findViewById(R.id.index);

        img1.setImageResource(R.drawable.expand);
        img2.setImageResource(R.drawable.reload);
        img3.setImageResource(R.drawable.pencil2);
        textView.setText(""+ss[position]);

        a=position;
        z=a+1;
        index.setText(""+z+"/"+ss.length);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a<ss.length-1) {
                    a++;
                    z=a+1;
                    textView.setText(""+ss[a]);
                    index.setText(""+z+"/"+ss.length);
                }
            }
        });
        a=position;
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a>0) {
                    a--;
                    z--;
                    textView.setText(""+ss[a]);
                    index.setText(""+z+"/"+ss.length);
                }
            }
        });

        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ClipboardManager cm = (ClipboardManager)getApplicationContext().getSystemService(Third_page.CLIPBOARD_SERVICE);
                cm.setText(textView.getText());
                Toast.makeText(Third_page.this, "Copied to clipboard", Toast.LENGTH_LONG).show();
            }
        });



        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cnt<15) {
                    if (cnt == i) {
                        textView.setBackgroundResource(config.gradientArr[i]);
                        cnt++;
                        i++;
                    }
                }else{
                    cnt=0;
                    i=0;
                }
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(Third_page.this);
                bottomSheetDialog.setContentView(R.layout.bottom_sheet_gradient);
                GradientAdapter adapter=new GradientAdapter(Third_page.this,config.gradientArr);
                gridView=bottomSheetDialog.findViewById(R.id.gridviewGradients);
                gridView.setAdapter(adapter);
                bottomSheetDialog.show();
                gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        textView.setBackgroundResource(config.gradientArr[i]);
                        bottomSheetDialog.dismiss();
                    }
                });
            }
        });

        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Third_page.this,Fourth_page.class);
                intent.putExtra("gridcolorarr",config.gradientArr);
                intent.putExtra("shayri",ss);
                intent.putExtra("a",a);
                startActivity(intent);
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(android.content.Intent.ACTION_SEND);
                String shareBody = textView.getText().toString();
                intent.setType("text/plain");
                intent.putExtra(android.content.Intent.EXTRA_SUBJECT, getString(R.string.subject));
                intent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(intent, getString(R.string.subject)));
            }
        });
    }
}
