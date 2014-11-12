package com.example.xiangzhao.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by xiangzhao on 11/11/14.
 */
public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
