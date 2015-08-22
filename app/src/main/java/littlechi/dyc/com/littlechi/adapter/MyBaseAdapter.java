package littlechi.dyc.com.littlechi.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import littlechi.dyc.com.littlechi.entity.BaseEntity;

/**
 * Created by Administrator on 2015/6/26.
 */
public abstract class MyBaseAdapter extends android.widget.BaseAdapter {


    protected Context context;
    protected List entitys;
    protected LayoutInflater mInflater;


    public  MyBaseAdapter(Context context,List<? extends Object> entitys) {
        mInflater = LayoutInflater.from(context);
        this.context = context;
        this.entitys = entitys;
    }

    @Override
    public int getCount() {
        return null == entitys ? 0 : entitys.size();
    }

    @Override
    public Object getItem(int position) {
        return null == entitys ? null : entitys.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder vh = null;
        if (null == convertView) {
            vh = new ViewHolder();
            convertView = mInflater.inflate(getLayoutId(),null);
            int[]ids = getConvertItemIds();
            if(null == ids ) {
                return null;
            }
          for(int a=0;a<ids.length;a++) {
              vh.addView(convertView,ids[a]);
          }
            initViews(vh);

        } else {

        }

        return convertView;
    }
   public abstract int getLayoutId();
    public abstract int[]getConvertItemIds();
    public abstract void initViews(ViewHolder convertView);
    public static   class ViewHolder {
        SparseArray<View> viewArray = new SparseArray<View>();
        public void addView(View convertView, int id) {
            if(null == convertView) {
                return ;
            }
            View contentView = convertView.findViewById(id);
            viewArray.put(id, contentView);
        }
        public View getView(int id){
            return viewArray.get(id);
        }

    }


}
