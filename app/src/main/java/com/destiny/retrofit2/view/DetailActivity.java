package com.destiny.retrofit2.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.destiny.retrofit2.R;
import com.destiny.retrofit2.helper.Constants;
import com.destiny.retrofit2.model.Flower;
import com.squareup.picasso.Picasso;

/**
 * Created by eboni on 20/02/2016.
 */
public class DetailActivity extends AppCompatActivity {

    ImageView iv_photo;
    TextView tv_name, tv_id, tv_category, tv_price, tv_instruction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        configViews();

        Intent intent = getIntent();
        Flower flower = (Flower) intent.getSerializableExtra(Constants.REFERENCE.FLOWER);

        tv_name.setText(""+flower.getName());
        tv_id.setText(""+flower.getProductId());
        tv_category.setText(""+flower.getCategory());
        tv_price.setText("S/."+flower.getPrice());
        tv_instruction.setText(flower.getInstructions());

        Picasso.with(getApplicationContext()).load("http://services.hanselandpetal.com/photos/" + flower.getPhoto()).into(iv_photo);
    }

    private void configViews(){
        tv_name = (TextView) findViewById(R.id.tv_name);
        tv_id = (TextView) findViewById(R.id.tv_id);
        tv_category = (TextView) findViewById(R.id.tv_category);
        tv_price = (TextView) findViewById(R.id.tv_price);
        tv_instruction = (TextView) findViewById(R.id.tv_instruction);
        iv_photo = (ImageView) findViewById(R.id.imageView);
    }
}
