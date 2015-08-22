package littlechi.dyc.com.littlechi.activity;
import android.os.Bundle;
import littlechi.dyc.com.littlechi.R;
import littlechi.dyc.com.littlechi.fragment.FragmentManager;
import littlechi.dyc.com.littlechi.fragment.MainFragment;
import littlechi.dyc.com.littlechi.fragment.ShoppingListFragment;
public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager.setMainFragmentWithStrName(this, MainFragment.class.getName(),R.id.fragmentlayout);
    }
}
