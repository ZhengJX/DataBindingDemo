package net.icgear.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import net.icgear.databindingdemo.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

//        User user = new User();
//        user.setName("用户名");
//        user.setNickName("昵称");
//        user.setEmail("l@1.net");
//        user.setVip(true);
//        user.setIcon("https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png");
//        user.setLevel(5);
//
//        User user1 = new User();
//        user1.setName("新人");
//        user1.setNickName("DB");
//        user1.setEmail("2@2.net");
//        user1.setVip(false);
//        user1.setLevel(2);
//
//        List<User> users = new ArrayList<User>();
//        users.add(user);
//        users.add(user1);
//        binding.setUsers(users);
        List<User> users = new ArrayList<User>();
        for (int i=0; i < 100; i++){
            User user = new User();
            user.setName("user " + i);
            user.setIcon("https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/bd_logo1_31bdc765.png");
            users.add(user);
        }

        CommonAdapter<User> adapter = new CommonAdapter<>(this,users,R.layout.item, net.icgear.databindingdemo.BR.user);
        binding.setAdapter(adapter);
    }
}
