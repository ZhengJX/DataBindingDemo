package net.icgear.databindingdemo;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Administrator on 2016/7/3.
 */
public class Utils {

    @BindingAdapter("imageUrl")
    public static void loadImage(ImageView view,String url){
        if (url == null){
            view.setImageResource(R.mipmap.ic_launcher);
        }else {

            Glide.with(view.getContext()).load(url).into(view);
        }
    }
}
