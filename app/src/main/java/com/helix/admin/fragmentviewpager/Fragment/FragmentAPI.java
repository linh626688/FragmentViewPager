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

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


import com.helix.admin.fragmentviewpager.R;
import com.helix.admin.fragmentviewpager.retrofitdemo.RetrofitHelper;
import com.helix.admin.fragmentviewpager.retrofitdemo.model.GoogleApiModel;

/**
 * Created by admin on 09/10/2017.
 */

public class FragmentAPI extends Fragment {
    TextView responseText;

    public static FragmentAPI newInstance() {
        FragmentAPI fragmentAPI = new FragmentAPI();
        return fragmentAPI;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_api, container, false);
        RetrofitHelper.getVideo().enqueue(new Callback<GoogleApiModel>() {
            @Override
            public void onResponse(Call<GoogleApiModel> call, Response<GoogleApiModel> response) {
                GoogleApiModel googleApiModel = response.body();
                Log.d("@@GoogleApiModel", googleApiModel.toString());
                responseText = (TextView) view.findViewById(R.id.response_text);
                responseText.setText(googleApiModel.toString());
            }
            @Override
            public void onFailure(Call<GoogleApiModel> call, Throwable t) {

            }
        });
        return view;
    }
}
