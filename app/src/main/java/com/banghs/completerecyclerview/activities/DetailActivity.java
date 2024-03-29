package com.banghs.completerecyclerview.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.banghs.completerecyclerview.R;
import com.banghs.completerecyclerview.models.Mountain;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_MOUNTAIN = "extra_mountain";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.img_detail);
        TextView name = findViewById(R.id.tv_name_detail);
        TextView description = findViewById(R.id.tv_desc_detail);

        Mountain mountain = getIntent().getParcelableExtra(EXTRA_MOUNTAIN);

        Glide.with(this).load(mountain.getPhoto()).into(imageView);
        name.setText(mountain.getName());
        description.setText(mountain.getDescription());

    }
}
