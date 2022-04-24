package com.example.amazontrapplication.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.amazontrapplication.Model.Urunler;
import com.example.amazontrapplication.R;

import java.util.List;

public class UrunlerAdapter extends RecyclerView.Adapter<UrunlerAdapter.UrunlerViewHolder> {
    private List<Urunler> urunlerListesi;

    public UrunlerAdapter(List<Urunler> urunlerListesi) {
        this.urunlerListesi = urunlerListesi;
    }

    public class UrunlerViewHolder extends RecyclerView.ViewHolder {
        private TextView urunAdi, urunOyu;
        private ImageView urunResmi, urunOyResmi1, urunOyResmi2, urunOyResmi3, urunOyResmi4, urunOyResmi5;
        public UrunlerViewHolder(@NonNull View itemView) {
            super(itemView);

            urunAdi = itemView.findViewById(R.id.textViewUrunAdi);
            urunOyu = itemView.findViewById(R.id.textViewOyOrani);

            urunResmi = itemView.findViewById(R.id.imageViewUrun);
            urunOyResmi1 = itemView.findViewById(R.id.star1);
            urunOyResmi2 = itemView.findViewById(R.id.star2);
            urunOyResmi3 = itemView.findViewById(R.id.star3);
            urunOyResmi4 = itemView.findViewById(R.id.star4);
            urunOyResmi5 = itemView.findViewById(R.id.star5);
        }

    }

    @NonNull
    @Override
    public UrunlerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.urunler_cards, parent, false);
        return new UrunlerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UrunlerViewHolder holder, int position) {
        holder.urunAdi.setText(urunlerListesi.get(position).getUrunAdi());
        holder.urunOyu.setText(urunlerListesi.get(position).getUrunOy());

        holder.urunResmi.setImageResource(urunlerListesi.get(position).getUrunResim());
        holder.urunOyResmi1.setImageResource(urunlerListesi.get(position).getUrunOyResim1());
        holder.urunOyResmi2.setImageResource(urunlerListesi.get(position).getUrunOyResim2());
        holder.urunOyResmi3.setImageResource(urunlerListesi.get(position).getUrunOyResim3());
        holder.urunOyResmi4.setImageResource(urunlerListesi.get(position).getUrunOyResim4());
        holder.urunOyResmi5.setImageResource(urunlerListesi.get(position).getUrunOyResim5());
    }

    @Override
    public int getItemCount() {
        return urunlerListesi.size();
    }


}
