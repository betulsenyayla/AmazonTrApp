package com.example.amazontrapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.Menu;

import com.example.amazontrapplication.Adapter.KategorilerAdapter;
import com.example.amazontrapplication.Adapter.UrunlerAdapter;
import com.example.amazontrapplication.Model.Kategoriler;
import com.example.amazontrapplication.Model.Urunler;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcTop, rcBottom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarAnasayfa);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.menu_icon);

        rcTop = findViewById(R.id.rcTop);
        rcTop.setHasFixedSize(true);

        rcTop.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));

        List<Kategoriler> kategorilerList = new ArrayList<>();

        kategorilerList.add(new Kategoriler(R.drawable.circle_1, "HERKES İÇİN"));
        kategorilerList.add(new Kategoriler(R.drawable.circle_2, "KADIN"));
        kategorilerList.add(new Kategoriler(R.drawable.circle_3, "ERKEK"));
        kategorilerList.add(new Kategoriler(R.drawable.circle_4, "GENÇLER"));

        KategorilerAdapter kategorilerAdapter = new KategorilerAdapter(kategorilerList);
        rcTop.setAdapter(kategorilerAdapter);


        rcBottom = findViewById(R.id.rcBottom);
        rcBottom.setHasFixedSize(true);

        rcBottom.setLayoutManager(new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL));

        List<Urunler> urunlerList = new ArrayList<>();

        urunlerList.add(new Urunler("3M Gizlilik Filtresi, 14\" Geniş Ekran Laptop, Siyah", R.drawable.bottom_1, R.drawable.star_icon_full, R.drawable.star_icon_full, R.drawable.star_icon_full, R.drawable.star_icon_full, R.drawable.star_icon_full, "(6)"));
        urunlerList.add(new Urunler("Apple Watch Nike Seri 3 GPS 38mm Uzay Grisi...", R.drawable.bottom_2, R.drawable.star_icon_full, R.drawable.star_icon_full, R.drawable.star_icon_full, R.drawable.star_icon_full, R.drawable.star_icon_half, "(3)"));
        urunlerList.add(new Urunler("Huawei Watch GT Sport Akıllı Saat, Siyah", R.drawable.bottom_3, R.drawable.star_icon_full, R.drawable.star_icon_full, R.drawable.star_icon_full, R.drawable.star_icon_full, R.drawable.star_icon_full, "(6)"));
        urunlerList.add(new Urunler("Viski Taşı | 12 Parça Viski Soğutucu (Koyu Gri)", R.drawable.bottom_4, R.drawable.star_icon_full, R.drawable.star_icon_full, R.drawable.star_icon_full, R.drawable.star_icon_full, R.drawable.star_icon_half, "(3)"));

        UrunlerAdapter urunlerAdapter = new UrunlerAdapter(urunlerList);
        rcBottom.setAdapter(urunlerAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }

}