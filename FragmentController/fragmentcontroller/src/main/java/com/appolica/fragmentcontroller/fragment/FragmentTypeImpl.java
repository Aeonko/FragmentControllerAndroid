package com.appolica.fragmentcontroller.fragment;

import android.support.v4.app.Fragment;

public class FragmentTypeImpl implements ControllerFragmentType {

    private final Class<? extends Fragment> frClass;
    private String tag;

    public FragmentTypeImpl(Class<? extends Fragment> frClass) {
        this(frClass, frClass.getName());
    }

    public FragmentTypeImpl(Class<? extends Fragment> frClass, String tag) {
        this.frClass = frClass;
        this.tag = tag;
    }

    @Override
    public Fragment getInstance() {
        try {
            return frClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String getTag() {
        return tag;
    }
}
