package donnywelist.wordpress.spacewelistbeta.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import donnywelist.wordpress.spacewelistbeta.R;
import donnywelist.wordpress.spacewelistbeta.model.ResultEnsiklopedia;

public class EnsiklpediaAdapter extends RecyclerView.Adapter<EnsiklopediaViewHolder> {

    private Context context;
    private List<ResultEnsiklopedia> resultEnsiklopediaList;

    ///constructor
    public EnsiklpediaAdapter(Context context, List<ResultEnsiklopedia> resultEnsiklopediaList){
        this.context = context;
        this.resultEnsiklopediaList = resultEnsiklopediaList;
    }

    @NonNull
    @Override
    public EnsiklopediaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_ensiklopedia,viewGroup,false);
        return new EnsiklopediaViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull EnsiklopediaViewHolder ensiklopediaViewHolder, int i) {
        ResultEnsiklopedia resultEnsiklopedia = resultEnsiklopediaList.get(i);
        ensiklopediaViewHolder.txtJudulEnsiklopedia.setText(resultEnsiklopedia.getNama());
        ensiklopediaViewHolder.setItem(resultEnsiklopediaList);

    }

    @Override
    public int getItemCount() {
        return resultEnsiklopediaList.size();
    }
}