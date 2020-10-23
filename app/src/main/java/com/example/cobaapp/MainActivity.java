package com.example.cobaapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.cobaapp.model.Mahasiswa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;
    private ArrayList<Mahasiswa> cobaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        addData();
        final Button button = findViewById(R.id.btn_add);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Mahasiswa coba = new Mahasiswa("Dimas Maulana", "1414370309", "123456789");
                mahasiswaArrayList.add(coba);
                adapter.notifyDataSetChanged();
//                EditNameDialogFragment editNameDialogFragment = EditNameDialogFragment.newInstance();
//                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
//                Fragment prev = getSupportFragmentManager().findFragmentByTag(editNameDialogFragment.getTag());
//                if (prev != null){
//                    ft.remove(prev);
//                }
//                ft.addToBackStack(null);
//
//                editNameDialogFragment.show(ft, editNameDialogFragment.getTag());
            }
        });


        final Button button_delete = findViewById(R.id.btn_delete);
        button_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = mahasiswaArrayList.size() - 1;
                removeItem(position);
            }
        });


        final Button myTestButton = findViewById(R.id.btn_popup);
        myTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyDialogFragment myDialogFragment = new MyDialogFragment();
                myDialogFragment.show(getSupportFragmentManager(), "COBASE");
            }
        });

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new MahasiswaAdapter(mahasiswaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }


    private void removeItem(int position) {
        if(position >= 0){
            mahasiswaArrayList.remove(position);
            adapter.notifyItemRemoved(position);
        } else {
            Context context = getApplicationContext();
            String myToast = "Data Habis";
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, myToast, duration);
            toast.show();
        }
//        adapter.notifyItemRangeChanged(newPosition, mahasiswaArrayList.size());
    }

    void addData(){
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Dimas Maulana", "1414370309", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Fadly Yonk", "1214234560", "987654321"));
        mahasiswaArrayList.add(new Mahasiswa("Ariyandi Nugraha", "1214230345", "987648765"));
        mahasiswaArrayList.add(new Mahasiswa("Aham Siswana", "1214378098", "098758124"));
    }
}