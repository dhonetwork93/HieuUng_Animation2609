package com.hxd.hoxuandieu.hieuung_animation2609;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgAlpha,imgScale,imgTranslase,imgRolate,imgzoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();
        final Animation animAlpha = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_alpha);
        final Animation animScale = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_scale);
        final Animation animTrans = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_translate);
        final Animation animRolate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_rotate);
        final Animation animZoom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_zoom_in_rotale);
        imgAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgAlpha.startAnimation(animAlpha);
                //v.startAnimation(animAlpha); hoạc dùng cái này
            }
        });

        imgScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animScale);
            }
        });
        imgTranslase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(animTrans);

            }
        });
        imgRolate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animRolate);
            }
        });
        imgzoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animZoom);
            }
        });
    }

    public void AnhXa(){
        imgAlpha = (ImageView) findViewById(R.id.imgAlpha);
        imgScale = (ImageView) findViewById(R.id.imgScale);
        imgTranslase = (ImageView) findViewById(R.id.imgTranslase);
        imgRolate = (ImageView) findViewById(R.id.imgRolate);
        imgzoom= (ImageView) findViewById(R.id.imgAll);

    }
}
