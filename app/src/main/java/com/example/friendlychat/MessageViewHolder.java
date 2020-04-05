package com.example.friendlychat;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MessageViewHolder extends RecyclerView.ViewHolder {

    ImageView photoImageView;
    TextView messageTextView;
    TextView authorTextView;

    public MessageViewHolder(@NonNull View itemView) {
        super(itemView);

        photoImageView = itemView.findViewById(R.id.photoImageView);
        messageTextView = itemView.findViewById(R.id.messageTextView);
        authorTextView = itemView.findViewById(R.id.nameTextView);
    }
}