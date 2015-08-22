package littlechi.dyc.com.littlechi.fragment;

import android.content.res.Resources;
import android.graphics.Color;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import littlechi.dyc.com.littlechi.R;
import littlechi.dyc.com.littlechi.adapter.ViewPagerAdapter;
import littlechi.dyc.com.littlechi.utils.CommonUtils;
import littlechi.dyc.com.littlechi.view.PagerSlidingTabStrip;

public class ShoppingListFragment extends BaseFragment{

    private littlechi.dyc.com.littlechi.view.PagerSlidingTabStrip  tabStrip;
    private android.support.v4.view.ViewPager  mypager;

    public String TAG = ((Object) this).getClass().getSimpleName();
    private View waitinglayout, errorlayout;



    public static ShoppingListFragment newInstance(String param1, String param2) {
        ShoppingListFragment fragment = new ShoppingListFragment();
        return fragment;
    }
    @Override
    public void initViews(ViewGroup rootView) {
        tabStrip = (littlechi.dyc.com.littlechi.view.PagerSlidingTabStrip)rootView.findViewById(R.id.tabStrip_data);
        mypager = (android.support.v4.view.ViewPager)rootView.findViewById(R.id.mypager_data);

    }
    private void initDetaildescPager() {
        ArrayList<View> viewlist = new ArrayList<View>();
        for(int a=0;a<3;a++) {
            ViewGroup listView = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.xlistview_with_infoview, null);
            viewlist.add(listView);
        }
//        XListView xListView = .findViewById(R.id.xlistView)
        ViewPagerAdapter adapter = new ViewPagerAdapter(context,viewlist,new String[] {"牛奶","雪糕","雪糕"});
        mypager.setAdapter(adapter);
        tabStrip.setViewPager(mypager);
        setTabsValue(tabStrip);
    }
    @Override
    public int getLayoutId() {
        return R.layout.fragment_commoditylist;
    }

    @Override
    public void setViews() {
        initDetaildescPager();
    }


    @Override
    public void onDetach() {
        super.onDetach();
    }

    /**
     * 对PagerSlidingTabStrip的各项属性进行赋值。
     */
    public void setTabsValue(PagerSlidingTabStrip tabs) {

        DisplayMetrics dm = Resources.getSystem().getDisplayMetrics();

        // 设置Tab是自动填充满屏幕的
        tabs.setShouldExpand(true);
        // 设置Tab的分割线是透明的'

        tabs.setDividerColor(Color.TRANSPARENT);
        // 设置Tab底部线的高度
        tabs.setUnderlineHeight((int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 1, dm));
        // 设置Tab Indicator的高度
        tabs.setIndicatorHeight((int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 2, dm));
        // 设置Tab标题文字的大小
        // tabs.setTextColor(getResources().getColor(R.color.actionbar_background));
        tabs.setTextColor(Color.parseColor("#0f0f0f"));
        tabs.setTextSize(CommonUtils.getDementions(14));
        // 设置Tab Indicator的颜色
        // tabs.setIndicatorColor(Color.parseColor("#45c01a"));
        tabs.setIndicatorColor(getResources().getColor(
                R.color.baseColor));
        // 设置选中Tab文字的颜色 (这是我自定义的一个方法)
        // tabs.setSelectedTextColor(Color.parseColor("#45c01a"));
        tabs.setSelectedTextColor(getResources().getColor(
                R.color.baseColor));

        // 取消点击Tab时的背景色
        tabs.setTabBackground(0);
    }
}