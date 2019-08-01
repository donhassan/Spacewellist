package donnywelist.wordpress.spacewelistbeta.adapter;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import donnywelist.wordpress.spacewelistbeta.R;
import donnywelist.wordpress.spacewelistbeta.model.ResultEnsiklopedia;

import donnywelist.wordpress.spacewelistbeta.view.TampilData2;

public class EnsiklopediaViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.txtJudulEnsiklopedia) TextView txtJudulEnsiklopedia;

    private List<ResultEnsiklopedia> resultEnsiklopedias;

    public EnsiklopediaViewHolder(@NonNull View view) {
        super(view);
        ButterKnife.bind(this,view);
    }


    public  void setItem(List<ResultEnsiklopedia> item){
        resultEnsiklopedias = item;
    }

    @OnClick()
    void click(@NonNull View itemView){
         int position = getAdapterPosition();
        //Toast.makeText(itemView.getContext(), "kepencet", Toast.LENGTH_SHORT).show();
        String nama = resultEnsiklopedias.get(position).getDeskripsi();
        Toast.makeText(itemView.getContext(),nama,Toast.LENGTH_LONG).show();

//        String id = resultEnsiklopedias.get(position).getID();
//        String nama = resultEnsiklopedias.get(position).getNama();
//        String kategori = resultEnsiklopedias.get(position).getKategori();
//        String  deskripsi = resultEnsiklopedias.get(position).getDeskripsi();
//
//        //Toast.makeText(itemView.getContext(),nama,Toast.LENGTH_LONG).show();
////        ///////////////////////////////////////////////////////////////////
////
//        Intent intent = new Intent(itemView.getContext(), TampilData2.class);
//        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//        intent.putExtra("id", id);
//        intent.putExtra("nama", nama);
//        intent.putExtra("kategori", kategori);
//        intent.putExtra("deskripsi", deskripsi);
//        itemView.getContext().startActivity(intent);
        ///////////////////////////////////////////////////////////////////



    }

}
