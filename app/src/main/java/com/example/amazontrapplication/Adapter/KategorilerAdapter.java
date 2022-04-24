package com.example.amazontrapplication.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amazontrapplication.Model.Kategoriler;
import com.example.amazontrapplication.R;

import java.util.List;

public class KategorilerAdapter extends RecyclerView.Adapter<KategorilerAdapter.KategorilerViewHolder> {
    private List<Kategoriler> kategorilerListesi;

    public KategorilerAdapter(List<Kategoriler> kategorilerListesi) {
        this.kategorilerListesi = kategorilerListesi;
    }

    public class KategorilerViewHolder extends RecyclerView.ViewHolder {
        private TextView kategoriAdi;
        private ImageView kategoriResmi;

        public KategorilerViewHolder(@NonNull View itemView) {
            super(itemView);
            kategoriAdi = itemView.findViewById(R.id.textViewKategoriAdi);
            kategoriResmi = itemView.findViewById(R.id.imageViewKategori);
        }
    }

    @NonNull
    @Override
    public KategorilerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.kategoriler_cards, parent, false);
        return new KategorilerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KategorilerViewHolder holder, int position) {
        holder.kategoriAdi.setText(kategorilerListesi.get(position).getKategoriAd());
        holder.kategoriResmi.setImageResource(kategorilerListesi.get(position).getKategoriResim());
    }

    @Override
    public int getItemCount() {
        return kategorilerListesi.size();
    }


}
