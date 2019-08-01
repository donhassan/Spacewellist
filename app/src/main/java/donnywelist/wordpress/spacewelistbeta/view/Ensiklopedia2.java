package donnywelist.wordpress.spacewelistbeta.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import donnywelist.wordpress.spacewelistbeta.R;
import donnywelist.wordpress.spacewelistbeta.adapter.EnsiklpediaAdapter;
import donnywelist.wordpress.spacewelistbeta.api.ClientAPI;
import donnywelist.wordpress.spacewelistbeta.api.restAPI;
import donnywelist.wordpress.spacewelistbeta.model.Ensiklopediamodels;
import donnywelist.wordpress.spacewelistbeta.model.ResultEnsiklopedia;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Ensiklopedia2 extends AppCompatActivity {

    @BindView(R.id.recyclerEnsiklopedia)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ensiklopedia2);

        ButterKnife.bind(this,this);
        tampildata();
    }

    void tampildata(){
        restAPI service= ClientAPI.getClient().create(restAPI.class);
        Call<Ensiklopediamodels> call=service.getdataAll();
        call.enqueue(new Callback<Ensiklopediamodels>() {
            @Override
            public void onResponse(Call<Ensiklopediamodels> call, Response<Ensiklopediamodels> response) {
                Toast.makeText(getApplicationContext().getApplicationContext(),"total ="+response.body().getResults().get(3).getNama(), Toast.LENGTH_LONG).show();
                LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
                recyclerView.setLayoutManager(linearLayoutManager);
                recyclerView.setHasFixedSize(true);
                EnsiklpediaAdapter ensiklpediaAdapter=new EnsiklpediaAdapter(getApplicationContext(),response.body().getResults());
                recyclerView.setAdapter(ensiklpediaAdapter);
            }

            @Override
            public void onFailure(Call<Ensiklopediamodels> call, Throwable t) {

            }
        });
    }
}
