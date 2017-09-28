package com.helix.admin.fragmentviewpager.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.helix.admin.fragmentviewpager.Fragment.Retrofit.APIClient;
import com.helix.admin.fragmentviewpager.Fragment.Retrofit.APIInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import com.helix.admin.fragmentviewpager.Fragment.Retrofit.POJO.MultipleResource;
import com.helix.admin.fragmentviewpager.Fragment.Retrofit.POJO.User;
import com.helix.admin.fragmentviewpager.Fragment.Retrofit.POJO.UserList;
import com.helix.admin.fragmentviewpager.R;

/**
 * Created by admin on 09/10/2017.
 */

public class FragmentAPI extends Fragment {
    TextView responseText;
    APIInterface apiInterface;

    public static FragmentAPI newInstance() {
        FragmentAPI fragmentAPI = new FragmentAPI();
        return fragmentAPI;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_api, container, false);
        responseText = view.findViewById(R.id.response_text);
        apiInterface = APIClient.getClient().create(APIInterface.class);
        /**
         GET List Resources
         **/
        Call call = apiInterface.doGetListResources();
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {


                Log.d("TAG",response.code()+"");

                String displayResponse = "";

                MultipleResource resource = (MultipleResource) response.body();
                Integer text = resource.page;
                Integer total = resource.total;
                Integer totalPages = resource.totalPages;
                List datumList = resource.data;

                displayResponse += text + " Page\n" + total + " Total\n" + totalPages + " Total Pages\n";

//                for (MultipleResource.Datum datum : datumList) {d
//                    displayResponse += datum.id + " " + datum.name + " " + datum.pantoneValue + " " + datum.year + "\n";
//                }
                for(int i =0; i<datumList.size();i++){
                    MultipleResource.Datum datum = (MultipleResource.Datum) datumList.get(i);
                    Toast.makeText(getContext(), "id : " + datum.id + " name: " +
                            datum.pantoneValue + " " + datum.year , Toast.LENGTH_SHORT).show();

                }

                responseText.setText(displayResponse);

            }

            @Override
            public void onFailure(Call call, Throwable t) {
                call.cancel();
            }
        });

        /**
         Create new user
         **/
        User user = new User("morpheus", "leader");
        Call call1 = apiInterface.createUser(user);
        call1.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                User user1 = (User) response.body();

                Toast.makeText(getContext(), user1.name + " " + user1.job + " " + user1.id + " " + user1.createdAt, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call call, Throwable t) {
                call.cancel();
            }
        });

        /**
         GET List Users
         **/
        Call call2 = apiInterface.doGetUserList("2");
        call2.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {

                UserList userList = (UserList) response.body();
                Integer text = userList.page;
                Integer total = userList.total;
                Integer totalPages = userList.totalPages;
                List datumList = userList.data;
                Toast.makeText(getContext(), text + " page\n" + total + " total\n" + totalPages + " totalPages\n", Toast.LENGTH_SHORT).show();

//                for (UserList.Datum datum : datumList) {
//                    Toast.makeText(getContext(), "id : " + datum.id + " name: " + datum.first_name + " " + datum.last_name + " avatar: " + datum.avatar, Toast.LENGTH_SHORT).show();
//                }
                for(int i =0; i<datumList.size();i++){
                    UserList.Datum datum = (UserList.Datum) datumList.get(i);
                    Toast.makeText(getContext(), "id : " + datum.id + " name: " + datum.first_name + " " + datum.last_name + " avatar: " + datum.avatar, Toast.LENGTH_SHORT).show();

                }


            }

            @Override
            public void onFailure(Call call, Throwable t) {
                call.cancel();
            }
        });


        /**
         POST name and job Url encoded.
         **/
        Call call3 = apiInterface.doCreateUserWithField("morpheus","leader");
        call3.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {
                UserList userList = (UserList) response.body();
                Integer text = userList.page;
                Integer total = userList.total;
                Integer totalPages = userList.totalPages;
                List datumList = userList.data;
                Toast.makeText(getContext(), text + " page\n" + total + " total\n" + totalPages + " totalPages\n", Toast.LENGTH_SHORT).show();

//                for (UserList.Datum datum : datumList) {
//                    Toast.makeText(getContext(), "id : " + datum.id + " name: " + datum.first_name + " " + datum.last_name + " avatar: " + datum.avatar, Toast.LENGTH_SHORT).show();
//                }
                for(int i =0; i<datumList.size();i++){
                    UserList.Datum datum = (UserList.Datum) datumList.get(i);
                    Toast.makeText(getContext(), "id : " + datum.id + " name: " + datum.first_name + " " + datum.last_name + " avatar: " + datum.avatar, Toast.LENGTH_SHORT).show();

                }
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                call.cancel();
            }
        });
        return view;
    }
}
