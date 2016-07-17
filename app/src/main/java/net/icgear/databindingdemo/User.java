package net.icgear.databindingdemo;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/7/3.
 */
public class User extends BaseObservable {
    private String name;
    private String nickName;
    private String email;

    private boolean vip;
    private int level;

    private String icon;

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(net.icgear.databindingdemo.BR.name);
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public void clickName(View view){

        Toast.makeText(view.getContext(),"点击用户名",Toast.LENGTH_SHORT).show();
    }

    public boolean longClickNickName(View view){

        Toast.makeText(view.getContext(),"长按昵称",Toast.LENGTH_SHORT).show();
        return true;
    }
}
