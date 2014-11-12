package com.example.xiangzhao.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by xiangzhao on 11/11/14.
 */
public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private Context mAppContext;
    private ArrayList<Crime> mCrimes;

    private CrimeLab(Context mAppContext) {
        this.mAppContext = mAppContext;
        mCrimes = new ArrayList<Crime>();
        for (int i = 0; i < 5; i++) {
            Crime c = new Crime();
            c.setTitle("Crime #" + i);
            c.setSolved(i % 2 == 0);
            mCrimes.add(c);
        }
    }

    public static CrimeLab get(Context c) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }

        return sCrimeLab;
    }

    public void addCrime(Crime c) {
        mCrimes.add(c);
    }

    public ArrayList<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime c : mCrimes)
            if (c.getId().equals(id))
                return c;
        return null;
    }
}
