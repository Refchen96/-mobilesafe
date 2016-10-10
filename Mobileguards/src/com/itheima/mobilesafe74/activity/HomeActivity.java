package com.itheima.mobilesafe74.activity;

import com.itheima.mobilesafe74.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends Activity {
	private GridView gr_root;
	private int[] mDrawbleids;
	private String[] mTitlestr;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		//初始化ui
		initUi();
		//更新数据
		initData();
		
	}

	private void initData() {
	    mTitlestr= new String [] {"手机防盗","通信卫士","软件管理","进程管理","流量统计",
			  "手机杀毒","缓存清理","高级工具","设置中心"
			   };
		 mDrawbleids =new int [] {R.drawable.home_safe,R.drawable.home_callmsgsafe,
				R.drawable.home_apps,R.drawable.home_taskmanager,R.drawable.home_netmanager,R.drawable.home_trojan,
				R.drawable.home_sysoptimize,R.drawable.home_tools,R.drawable.home_settings
		};
		 //设置数据适配器
		 gr_root.setAdapter(new MyAdapter());
	}

	private void initUi() {
		
	gr_root= (GridView) findViewById(R.id.gr_root);
	
	}
	
/**
 * @author CRF
 *创建一个适配器
 */
class MyAdapter extends BaseAdapter{

	@Override
	public int getCount() {
		
		return  mTitlestr.length;
	}

	@Override
	public Object getItem(int position) {
		
		return  mTitlestr[position];
	}

	@Override
	public long getItemId(int position) {
		
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = View.inflate(getApplicationContext(), R.layout.gridview_item, null);
		TextView tv_title = (TextView) view.findViewById(R.id.tv_title);
		ImageView iv_icon = (ImageView) view.findViewById(R.id.iv_icon);
		tv_title.setText(mTitlestr[position]);
		iv_icon.setBackgroundResource(mDrawbleids[position]);
		return view;
	}
	
}
	
}
