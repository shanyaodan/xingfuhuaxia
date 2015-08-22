package littlechi.dyc.com.littlechi.fragment;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import littlechi.dyc.com.littlechi.R;
import littlechi.dyc.com.littlechi.adapter.ShoppingPosAdapter;
import littlechi.dyc.com.littlechi.entity.ShopEntity;

/**
 * Created by Administrator on 2015/7/13.
 */
public class MainFragment extends  BaseFragment {

    private EditText mm_location_name_edt;
    private Button chi_position_btn;
    private TextView chi_position_search_context_txt;
    private Button  chi_reposition_btn;
    private ListView chi_postion_result_lv;



    @Override
    public void initViews(ViewGroup rootView) {

        mm_location_name_edt = (EditText)rootView.findViewById(R.id.mm_location_name_edt_data);
        chi_position_btn = (Button)rootView.findViewById(R.id.chi_position_btn_data);
        chi_position_search_context_txt = (TextView)rootView.findViewById(R.id.chi_position_search_context_txt_data);
        chi_reposition_btn = (Button)rootView.findViewById(R.id.chi_reposition_btn);
        chi_postion_result_lv = (ListView)rootView.findViewById(R.id.chi_postion_result_lv_data);


    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_main ;


    }

    @Override
    public void setViews() {

        ArrayList<ShopEntity> list = new ArrayList<ShopEntity>();

        for(int a=0;a<10;a++) {

            ShopEntity entity = new ShopEntity();
            entity.distence = "200米";
            entity.shopName = "小吃店"+a;
            entity.postion = "玉泉路位置"+a ;
            list.add(entity);
        }
        chi_postion_result_lv.setAdapter(new ShoppingPosAdapter(context,list));

        chi_postion_result_lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                FragmentManager.setFragment((FragmentActivity)context,BaseFragment.getInstance(context,ShoppingListFragment.class.getName()));
            }
        });
    }


}
