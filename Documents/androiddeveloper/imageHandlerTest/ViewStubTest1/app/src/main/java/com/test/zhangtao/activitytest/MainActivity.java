package com.test.zhangtao.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by zhangtao on 16/12/26.
 */

public class MainActivity extends Activity
{
    private SurfaceViewTemplate mLuckyPan;
    private ImageView mStartBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        mLuckyPan = (SurfaceViewTemplate) findViewById(R.id.luckyPan);
        mStartBtn = (ImageView) findViewById(R.id.id_start_btn);

        mStartBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (!mLuckyPan.luckyIsRunning())
                {
                    mLuckyPan.luckyStart();
                    mStartBtn.setImageResource(R.drawable.stop);
                }
                else
                {
                    if (!mLuckyPan.isShouldEnd())
                    {
                        mLuckyPan.luckyEnd();
                        mStartBtn.setImageResource(R.drawable.start);
                    }
                }
            }
        });
    }
}
