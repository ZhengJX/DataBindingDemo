package net.icgear.databindingdemo;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by Administrator on 2016/7/4.
 */
public class CommonAdapter<T> extends BaseAdapter {

    private Context context;
    private List<T> list;
    private int layoutId;
    private int variableId;

    public CommonAdapter(Context context, List<T> list, int layoutId, int variableId) {
        this.context = context;
        this.list = list;
        this.layoutId = layoutId;
        this.variableId = variableId;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewDataBinding binding = null;
        if (convertView == null){
            binding = DataBindingUtil.inflate(LayoutInflater.from(context),layoutId,parent,false);

        }else {
            binding = DataBindingUtil.getBinding(convertView);
        }

        binding.setVariable(variableId,list.get(position));
        return binding.getRoot();
    }
}
