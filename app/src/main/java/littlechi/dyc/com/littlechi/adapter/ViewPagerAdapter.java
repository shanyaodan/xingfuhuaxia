package littlechi.dyc.com.littlechi.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import littlechi.dyc.com.littlechi.entity.BaseEntity;

/**
 * Created by Administrator on 2015/6/26.
 */
public class ViewPagerAdapter extends PagerAdapter {
  private Context context;
  private   ArrayList<View> mArraylist;
  private String[] titles;
  public   ViewPagerAdapter(Context context,ArrayList<View> arraylist,String[] titles) {
           this.context = context;
           this.mArraylist = arraylist;
            this.titles = titles;
    }

    @Override
    public int getCount() {
        return null==mArraylist?0:mArraylist.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return null == titles?"":titles[position];
    }



    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        if(null == mArraylist) {
            return null;
        }

       View item =  mArraylist.get(position);
        container.addView(item);

        return item;
    }


    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        if(null==mArraylist) {
            return;
        }
        container.removeView(mArraylist.get(position));

    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view ==o;
    }
}
