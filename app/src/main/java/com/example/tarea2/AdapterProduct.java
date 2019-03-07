package com.example.tarea2;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tarea2.beans.ItemProduct;

import java.util.ArrayList;

public class AdapterProduct extends RecyclerView.Adapter<AdapterProduct.ViewHolder>{
    ArrayList<ItemProduct> mDataSet;
    private Context context;

    public AdapterProduct(Context context, ArrayList<ItemProduct> myDataSet){

        this.mDataSet = myDataSet;
        this.context = context;
    }



    public static class ViewHolder extends RecyclerView.ViewHolder{
        public Button mDetail;
        public TextView mProductoTitle;
        public TextView mProductoStore;
        public TextView mProductoLocation;
        public TextView mProductoPhone;
        public ImageView mProductImage;
        public ImageView mProductThumbnail;
        public RelativeLayout mEventLayout;
        public ViewHolder(View v){
            super (v);
            mEventLayout = (RelativeLayout) v.findViewById(R.id.item_product_layout);
            mDetail = (Button) v.findViewById(R.id.item_product_detail);
            mProductoTitle = (TextView) v.findViewById(R.id.item_product_title);
            mProductoStore = (TextView) v.findViewById(R.id.item_product_store);
            mProductoLocation = (TextView) v.findViewById(R.id.item_product_location);
            mProductoPhone = (TextView) v.findViewById(R.id.item_product_phone);
            mProductImage = (ImageView) v.findViewById(R.id.item_product_image);
            mProductThumbnail = (ImageView) v.findViewById(R.id.item_product_thumbnail);
        }
    }

    public AdapterProduct.ViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.mProductoTitle.setText(mDataSet.get(position).getTitle());
        holder.mProductoStore.setText(mDataSet.get(position).getStore());
        holder.mProductoLocation.setText(mDataSet.get(position).getLocalitation());
        holder.mProductoPhone.setText(mDataSet.get(position).getPhone());
        holder.mDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, mDataSet.get(position).toString(), Toast.LENGTH_LONG).show();
            }
        });
        holder.mProductoPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: " + mDataSet.get(position).getPhone()));
                context.startActivity(intent);
            }
        });
        switch (mDataSet.get(position).getImage()){
            case 0:
                holder.mProductImage.setImageResource(R.drawable.mac); break;
            case 1:
                holder.mProductImage.setImageResource(R.drawable.alienware); break;
        }
        Bitmap bitmap = ((BitmapDrawable)holder.mProductThumbnail.getDrawable()).getBitmap();
        holder.mProductThumbnail.setImageBitmap(bitmap);
    }

    public int getItemCount(){
        return mDataSet.size();
    }


}
