package demo.base;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义Fragment页面适配器
 *
 * @author Hunter
 */
public class CustomFragmentPagerAdapter extends FragmentPagerAdapter {
    List<Fragment> mFragments;
    List<String> mTitles;

    public CustomFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * 设置当前adapter的页面集合
     *
     * @param fragments
     */
    public void setPagers(List<Fragment> fragments) {
        mFragments = fragments;
    }

    /**
     * 添加一个页面
     *
     * @param fragment
     */
    public void addPager(Fragment fragment) {
        if (mFragments == null) {
            ArrayList<Fragment> fragments = new ArrayList<Fragment>();
            fragments.add(fragment);
            setPagers(fragments);
        } else {
            mFragments.add(fragment);
        }
    }

    /**
     * 添加一组页面
     *
     * @param fragments
     */
    public void addPagers(List<Fragment> fragments) {
        if (mFragments == null) {
            setPagers(fragments);
        } else {
            mFragments.addAll(fragments);
        }
    }

    /**
     * 设置页面的标题
     *
     * @param titles
     */
    public void setTitles(List<String> titles) {
        mTitles = titles;
    }

    /**
     * 添加一个页面的标题
     *
     * @param title
     */
    public void addTitle(String title) {
        if (mTitles == null) {
            ArrayList<String> titles = new ArrayList<String>();
            titles.add(title);
            setTitles(titles);
        } else {
            mTitles.add(title);
        }
    }

    /**
     * 添加一组页面的标题
     *
     * @param titles
     */
    public void addTitles(List<String> titles) {
        if (mTitles == null) {
            setTitles(titles);
        } else {
            mTitles.addAll(titles);
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles == null ? null : mTitles.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments == null ? null : mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments == null ? 0 : mFragments.size();
    }

}
