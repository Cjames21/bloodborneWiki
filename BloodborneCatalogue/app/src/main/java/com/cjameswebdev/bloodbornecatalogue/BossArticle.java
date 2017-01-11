package com.cjameswebdev.bloodbornecatalogue;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class BossArticle extends AppCompatActivity {

    public static final String BOSS_NAME = "com.cjameswebdev.bloodbornecatalogue.bossName";
    public static final String BOSS_DESCRIPTION = "com.cjameswebdev.bloodbornecatalogue.bossDesc";
    public static final String BOSS_LORE = "com.cjameswebdev.bloodbornecatalogue.bossLore";
    public static final String BOSS_FIGHT_STRATEGY = "com.cjameswebdev.bloodbornecatalogue.bossFightStrategy";
    public static final String BOSS_LOOT = "com.cjameswebdev.bloodbornecatalogue.bossLoot";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss_article);

        // Wire views to member variables
        TextView bossTitleView = (TextView) findViewById(R.id.boss_title);
        TextView bossDescView = (TextView) findViewById(R.id.boss_description);
        TextView bossLoreView = (TextView) findViewById(R.id.boss_lore);
        TextView bossFightStrategyView = (TextView) findViewById(R.id.boss_fight_strategy);
        TextView bossLootView = (TextView) findViewById(R.id.boss_loot);

        // Get intent data
        Intent i = getIntent();
        String bossName = i.getStringExtra(BOSS_NAME);
        String bossDescription = i.getStringExtra(BOSS_DESCRIPTION);
        String bossLore = i.getStringExtra(BOSS_LORE);
        String bossFightStrategy = i.getStringExtra(BOSS_FIGHT_STRATEGY);
        String bossLoot = i.getStringExtra(BOSS_LOOT);

        // Set all text views according to data received
        bossTitleView.setText(bossName);
        bossDescView.setText(bossDescription);
        bossLoreView.setText(bossLore);
        bossFightStrategyView.setText(bossFightStrategy);
        bossLootView.setText(bossLoot);

    }
}
