package com.ads.control.ads.bannerAds;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.ads.control.R;
import com.ads.control.admob.Admob;
import com.ads.control.ads.NoDoorAd;
import com.ads.control.ads.NoDoorAdCallback;
import com.ads.control.funtion.AdCallback;

public class NoDoorBannerAdView extends RelativeLayout {

    private String TAG = "ITGBannerAdView";

    public NoDoorBannerAdView(@NonNull Context context) {
        super(context);
        init();
    }

    public NoDoorBannerAdView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public NoDoorBannerAdView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }


    public NoDoorBannerAdView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.layout_banner_control, this);
    }

    public void loadBanner(Activity activity, String idBanner) {
        loadBanner(activity, idBanner, new NoDoorAdCallback());
    }

    public void loadBanner(Activity activity, String idBanner, NoDoorAdCallback ITGAdCallback) {
        NoDoorAd.getInstance().loadBanner(activity, idBanner, ITGAdCallback);
    }

    public void loadInlineBanner(Activity activity, String idBanner, String inlineStyle) {
        Admob.getInstance().loadInlineBanner(activity, idBanner, inlineStyle);
    }

    public void loadInlineBanner(Activity activity, String idBanner, String inlineStyle, AdCallback adCallback) {
        Admob.getInstance().loadInlineBanner(activity, idBanner, inlineStyle, adCallback);
    }

    public void loadBannerFragment(Activity activity, String idBanner) {
        NoDoorAd.getInstance().loadBannerFragment(activity, idBanner, getRootView());
    }

    public void loadBannerFragment(Activity activity, String idBanner, AdCallback adCallback) {
        NoDoorAd.getInstance().loadBannerFragment(activity, idBanner, getRootView(), adCallback);
    }

    public void loadInlineBannerFragment(Activity activity, String idBanner, String inlineStyle) {
        Admob.getInstance().loadInlineBannerFragment(activity, idBanner, getRootView(), inlineStyle);
    }

    public void loadInlineBannerFragment(Activity activity, String idBanner, String inlineStyle, AdCallback adCallback) {
        Admob.getInstance().loadInlineBannerFragment(activity, idBanner, getRootView(), inlineStyle, adCallback);
    }
}