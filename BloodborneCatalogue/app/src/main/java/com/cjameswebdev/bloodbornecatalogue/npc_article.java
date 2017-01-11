package com.cjameswebdev.bloodbornecatalogue;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class npc_article extends AppCompatActivity {

    public static final String NPC_NAME = "com.cjameswebdev.bloodbornecatalogue.npcName";
    public static final String NPC_DESCRIPTION = "com.cjameswebdev.bloodbornecatalogue.npcDescription";
    public static final String NPC_ITEMS = "com.cjameswebdev.bloodbornecatalogue.npcItems";
    public static final String NPC_LORE_GUIDE = "com.cjameswebdev.bloodbornecatalogue.npcLoreGuide";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_npc__article_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent intent = getIntent();

        // Wire views to member variables
        TextView npcTitle = (TextView) findViewById(R.id.npc_title);
        TextView npcDescription = (TextView) findViewById(R.id.npc_description);
        TextView npcItems = (TextView) findViewById(R.id.npc_associated_items);
        TextView npcLore = (TextView) findViewById(R.id.npc_lore_guide);

        // Get NPC title extra here
        String npcName = intent.getStringExtra(NPC_NAME);
        // Get NPC description extra
        String npcDesc = intent.getStringExtra(NPC_DESCRIPTION);
        // Get NPC items extra here
        String npcAssociatedItems = intent.getStringExtra(NPC_ITEMS);
        // Get NPC quest guide here
        String npcQuestGuide = intent.getStringExtra(NPC_LORE_GUIDE);

        // Set all TextViews according to the intent's data
        npcTitle.setText(npcName);
        npcDescription.setText(npcDesc);
        npcItems.setText(npcAssociatedItems);
        npcLore.setText(npcQuestGuide);

        ImageView npcImg = (ImageView) findViewById(R.id.npc_image);
        npcImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: OnClick > Enlarge image for user to view up closer
            }
        });



    }

}
