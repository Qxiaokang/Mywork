package com.example.administrator.mywork;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.viewpagerindicator.TabPageIndicator;

import java.util.ArrayList;
import java.util.List;

import static com.example.administrator.mywork.R.id.mypager;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private int picid[]={R.mipmap.slide1,R.mipmap.slide2,R.mipmap.slide3,R.mipmap.share_bg};
    private TabPageIndicator indicator;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(mypager);
       indicator = (TabPageIndicator) findViewById(R.id.mydicator);

        List<ImageView> list=new ArrayList<>();

        for(int i = 0; i < picid.length; i++){
            ImageView imageView=new ImageView(this);
            imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(),picid[i]));
            list.add(imageView);

        }
        MyAdapter myAdapter=new MyAdapter(list);
        viewPager.setAdapter(myAdapter);
        for(int i = 0; i < list.size(); i++){
            TextView textView=new TextView(this);
            textView.setText("Q"+i);
            textView.setTextColor(Color.RED);

        }

       indicator.setViewPager(viewPager);
       /* viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener(){
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels){


            }

            @Override
            public void onPageSelected(int position){
                indicator.setCurrentItem(position);

            }

            @Override
            public void onPageScrollStateChanged(int state){
            }
        });

        indicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener(){
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels){

            }

            @Override
            public void onPageSelected(int position){
                viewPager.setCurrentItem(position);
            }

            @Override
            public void onPageScrollStateChanged(int state){
            }
        });
*/
    }
}
