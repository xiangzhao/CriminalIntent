package com.example.xiangzhao.criminalintent;

import android.support.v4.app.Fragment;


public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return CrimeFragment.newInstance((java.util.UUID) getIntent()
                .getSerializableExtra(CrimeFragment.EXTRA_CRIME_ID));
    }

}
