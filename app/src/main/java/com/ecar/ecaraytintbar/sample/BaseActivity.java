package com.ecar.ecaraytintbar.sample;

import android.support.v7.app.AppCompatActivity;

import com.ecar.mylibrary.StatusBarUtil;
import com.readystatesoftware.systembartint.sample.R;


/**
 * Created by Jaeger on 16/2/14.
 *
 * Email: chjie.jaeger@gmail.com
 * GitHub: https://github.com/laobie
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        setStatusBar();
    }

    protected void setStatusBar() {
        StatusBarUtil.setColor(this, getResources().getColor(R.color.colorPrimary));
    }
}
