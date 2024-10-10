package com.example.customlistview;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<Item> adapter;
    private List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        itemList = new ArrayList<>();

        // Add some sample data
        itemList.add(new Item("Item 1", "This is item 1", R.drawable.image1));
        itemList.add(new Item("Item 2", "This is item 2", R.drawable.image2));
        itemList.add(new Item("Item 3", "This is item 3", R.drawable.image3));

        itemList.add(new Item("Item 1", "This is item 1", R.drawable.image1));
        itemList.add(new Item("Item 2", "This is item 2", R.drawable.image2));
        itemList.add(new Item("Item 3", "This is item 3", R.drawable.image3));

        itemList.add(new Item("Item 1", "This is item 1", R.drawable.image1));
        itemList.add(new Item("Item 2", "This is item 2", R.drawable.image2));
        itemList.add(new Item("Item 3", "This is item 3", R.drawable.image3));

        itemList.add(new Item("Item 1", "This is item 1", R.drawable.image1));
        itemList.add(new Item("Item 2", "This is item 2", R.drawable.image2));
        itemList.add(new Item("Item 3", "This is item 3", R.drawable.image3));

        itemList.add(new Item("Item 1", "This is item 1", R.drawable.image1));
        itemList.add(new Item("Item 2", "This is item 2", R.drawable.image2));
        itemList.add(new Item("Item 3", "This is item 3", R.drawable.image3));

        itemList.add(new Item("Item 1", "This is item 1", R.drawable.image1));
        itemList.add(new Item("Item 2", "This is item 2", R.drawable.image2));
        itemList.add(new Item("Item 3", "This is item 3", R.drawable.image3));

        itemList.add(new Item("Item 1", "This is item 1", R.drawable.image1));
        itemList.add(new Item("Item 2", "This is item 2", R.drawable.image2));
        itemList.add(new Item("Item 3", "This is item 3", R.drawable.image3));

        itemList.add(new Item("Item 1", "This is item 1", R.drawable.image1));
        itemList.add(new Item("Item 2", "This is item 2", R.drawable.image2));
        itemList.add(new Item("Item 3", "This is item 3", R.drawable.image3));

        itemList.add(new Item("Item 1", "This is item 1", R.drawable.image1));
        itemList.add(new Item("Item 2", "This is item 2", R.drawable.image2));
        itemList.add(new Item("Item 3", "This is item 3", R.drawable.image3));

        itemList.add(new Item("Item 1", "This is item 1", R.drawable.image1));
        itemList.add(new Item("Item 2", "This is item 2", R.drawable.image2));
        itemList.add(new Item("Item 3", "This is item 3", R.drawable.image3));

        adapter = new CustomAdapter(this, itemList);
        listView.setAdapter(adapter);
    }

    public class Item {
        private String title;
        private String description;
        private int imageResource;

        public Item(String title, String description, int imageResource) {
            this.title = title;
            this.description = description;
            this.imageResource = imageResource;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public int getImageResource() {
            return imageResource;
        }
    }

    public class CustomAdapter extends ArrayAdapter<Item> {
        private Context context;
        private List<Item> itemList;

        public CustomAdapter(Context context, List<Item> itemList) {
            super(context, 0, itemList);
            this.context = context;
            this.itemList = itemList;
        }

        @NonNull
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = convertView;
            if (view == null) {
                view = LayoutInflater.from(context).inflate(R.layout.activity_main, parent, false);
            }

            Item item = itemList.get(position);

            ImageView imageView = view.findViewById(R.id.imageView);
            imageView.setImageResource(item.getImageResource());

            TextView textViewTitle = view.findViewById(R.id.textViewTitle);
            textViewTitle.setText(item.getTitle());

            TextView textViewDescription = view.findViewById(R.id.textViewDescription);
            textViewDescription.setText(item.getDescription());

            return view;
        }
    }
}