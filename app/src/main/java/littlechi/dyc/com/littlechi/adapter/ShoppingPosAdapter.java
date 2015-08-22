package littlechi.dyc.com.littlechi.adapter;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import littlechi.dyc.com.littlechi.R;
import littlechi.dyc.com.littlechi.entity.ShopEntity;

import java.util.List;

public class ShoppingPosAdapter extends MyBaseAdapter{

	public ShoppingPosAdapter(Context context, List<ShopEntity> data) {
		super(context, data);

	}

	public  int getLayoutId(){
		return  R.layout.item_listlayout_postion;
	}
    public  int[]getConvertItemIds(){
		return new int[]{R.id.chi_shop_name_tv,R.id.chi_shop_address_tv,R.id.chi_shop_distance_tv,R.id.chi_shop_num_tv,R.id.chi_shop_child_ll,};
    }

	@Override
	public void initViews(MyBaseAdapter.ViewHolder convertView) {



		((TextView)convertView.getView(R.id.chi_shop_name_tv)).setText("石景山小吃店");
		((TextView)convertView.getView(R.id.chi_shop_address_tv)).setText("玉泉路地铁");
		((TextView)convertView.getView(R.id.chi_shop_distance_tv)).setText("200米");
	}


	
}
