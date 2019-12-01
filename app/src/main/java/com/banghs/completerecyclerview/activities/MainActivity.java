package com.banghs.completerecyclerview.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.banghs.completerecyclerview.R;
import com.banghs.completerecyclerview.adapters.ItemCardViewAdapter;
import com.banghs.completerecyclerview.adapters.ItemGridAdapter;
import com.banghs.completerecyclerview.adapters.ItemListAdapter;
import com.banghs.completerecyclerview.models.Mountain;
import com.banghs.completerecyclerview.models.MountainData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<Mountain> list;

    final String STATE_TITLE = "state_title";
    final String STATE_LIST = "state_list";
    final String STATE_MODE = "state_mode";

    int mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        list = new ArrayList<>();
//        list.addAll(MountainData.getListData());
//        showRecyclerViewList();

        if (savedInstanceState == null) {
            setActionBarTitle("List Mode");
            list.addAll(MountainData.getListData());
            showRecyclerViewList();
            mode = R.id.action_list;
        } else {
            String stateTitle = savedInstanceState.getString(STATE_TITLE);
            ArrayList<Mountain> stateList = savedInstanceState.getParcelableArrayList(STATE_LIST);
            int stateMode = savedInstanceState.getInt(STATE_MODE);
            setActionBarTitle(stateTitle);
            list.addAll(stateList);
            setMode(stateMode);
        }
    }

    // menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.item_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    private void setMode(int itemId) {
        String title = null;
        switch (itemId) {
            case R.id.about_developer:
                title = "About Developer";
                showRecyclerViewGrid();
                break;
            case R.id.action_list:
                title = "ListView Mode";
                recyclerView.setLayoutManager(new LinearLayoutManager(this));
                ItemListAdapter listAdapter = new ItemListAdapter(this);
                listAdapter.setListMountain(list);
                recyclerView.setAdapter(listAdapter);
                break;
            case R.id.action_cardview:
                title = "CardView Mode";
                recyclerView.setLayoutManager(new LinearLayoutManager(this));
                ItemCardViewAdapter cardViewAdapter = new ItemCardViewAdapter(this);
                cardViewAdapter.setListMountain(list);
                recyclerView.setAdapter(cardViewAdapter);
                break;

        }
        mode = itemId;
        setActionBarTitle(title);
        return ;
    }

    private void showRecyclerCardView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemCardViewAdapter cardViewAdapter = new ItemCardViewAdapter(this);
        cardViewAdapter.setListMountain(list);
        recyclerView.setAdapter(cardViewAdapter);
    }


    private void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    private void showRecyclerViewGrid() {
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        ItemGridAdapter gridAdapter = new ItemGridAdapter(this);
        gridAdapter.setListMountain(list);
        recyclerView.setAdapter(gridAdapter);
    }

    private void showRecyclerViewList() {
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ItemListAdapter listAdapter = new ItemListAdapter(this);
        listAdapter.setListMountain(list);
        recyclerView.setAdapter(listAdapter);
    }

}
