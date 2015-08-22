package littlechi.dyc.com.littlechi.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2015/6/26.
 */
public abstract class  BaseFragment extends Fragment {



    protected  ViewGroup rootView;
    protected Context context;

    public abstract void initViews(ViewGroup rootView);
    public abstract int getLayoutId();
    public abstract void setViews();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        context = getActivity();
        if(null == rootView) {
        rootView = (ViewGroup) inflater.inflate(getLayoutId(),container,false);
        initViews(rootView);
        }
        setViews();
        return rootView;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (rootView != null) {
            ViewGroup parentViewGroup = (ViewGroup) rootView.getParent();
            if (parentViewGroup != null) {
                parentViewGroup.removeAllViews();
            }
        }
    }

    public static BaseFragment getInstance(Context context, String fragmentName) {

        return getInstance(context, fragmentName, null);
    }

    public static BaseFragment getInstance(Context context,String fragmentName, Bundle bundle) {
        BaseFragment instance = null;
        instance = (BaseFragment) Fragment.instantiate(context, fragmentName,bundle);
        instance.context = context;
        return instance;
    }


}
