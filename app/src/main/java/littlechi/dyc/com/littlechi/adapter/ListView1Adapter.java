package littlechi.dyc.com.littlechi.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import littlechi.dyc.com.littlechi.R;

/**
 * Created by Administrator on 2015/6/26.
 */
public class ListView1Adapter extends MyBaseAdapter {

    public ListView1Adapter(Context context, List<? extends Object> entitys) {
        super(context, entitys);
    }

    @Override
    public int getLayoutId() {
        return R.layout.item_listlayout_postion;
    }
    @Override
    public int[] getConvertItemIds() {
        return new int[]{R.id.chi_shop_name_tv, R.id.chi_shop_address_tv, R.id.chi_shop_distance_tv, R.id.chi_shop_num_tv};
    }

    @Override
    public void initViews(ViewHolder convertView) {
;
    }

}
