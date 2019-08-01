package donnywelist.wordpress.spacewelistbeta.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import donnywelist.wordpress.spacewelistbeta.R;
import donnywelist.wordpress.spacewelistbeta.adapter.EnsiklpediaAdapter;
import donnywelist.wordpress.spacewelistbeta.api.ClientAPI;
import donnywelist.wordpress.spacewelistbeta.api.restAPI;
import donnywelist.wordpress.spacewelistbeta.model.Ensiklopediamodels;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Ensiklopedia extends AppCompatActivity {
    @BindView(R.id.recyclerEnsiklopedia)
    RecyclerView recyclerView;

    public Ensiklopedia(){}
    RelativeLayout view;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = (RelativeLayout) inflater.inflate(R.layout.activity_ensiklopedia, container, false);


        super.onCreate(savedInstanceState);
        ButterKnife.bind(this,view);
        tampildata();
        return view;
    }
    void tampildata(){
        restAPI service= ClientAPI.getClient().create(restAPI.class);
        Call<Ensiklopediamodels> call=service.getdataAll();
        call.enqueue(new Callback<Ensiklopediamodels>() {
            @Override
            public void onResponse(Call<Ensiklopediamodels> call, Response<Ensiklopediamodels> response) {
                Toast.makeText(getApplicationContext().getApplicationContext(),"total ="+response.body().getTotal_result(), Toast.LENGTH_LONG).show();
                LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext().getApplicationContext());
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setHasFixedSize(true);
                EnsiklpediaAdapter resepMasakanAdapter=new EnsiklpediaAdapter(getApplicationContext().getApplicationContext(),response.body().getResults());
                recyclerView.setAdapter(resepMasakanAdapter);
            }

            @Override
            public void onFailure(Call<Ensiklopediamodels> ceall, Throwable t) {

            }
        });
    }
}
