package com.tourguide.mytourguide;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class pageAdapter extends FragmentPagerAdapter {

    private Context mContext;

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.title1);
        }

        else if (position == 1) {
            return mContext.getString(R.string.title2);
        }

        else if (position == 2) {
            return mContext.getString(R.string.title3);
        }
        else {
            return mContext.getString(R.string.title4);
        }
    }

    public pageAdapter(MainActivity mainActivity, FragmentManager fm) {
        super(fm);
        mContext = mainActivity;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CairoFragment();
        } else if (position == 1) {
            return new AlexFragment();
        }
        else if (position == 3) {
            return new GizaFragment();
        }

        else {
            return new SharmFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }
}
