package com.cjameswebdev.bloodbornecatalogue;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class EnemyArticle extends AppCompatActivity {

    public static final String ENEMY_NAME = "com.cjameswebdev.bloodbornecatalogue.enemyName";
    public static final String ENEMY_DESCRIPTION = "com.cjameswebdev.bloodbornecatalogue.enemyDesc";
    public static final String ENEMY_FIGHT_STRATEGY = "com.cjameswebdev.bloodbornecatalogue.enemyFightStrat";
    public static final String ENEMY_LOOT = "com.cjameswebdev.bloodbornecatalogue.enemyLoot";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enemy_article);
        Intent i = getIntent();

        TextView enemyNameView = (TextView) findViewById(R.id.enemy_title);
        TextView enemyDescView = (TextView) findViewById(R.id.enemy_description);
        TextView enemyFightStrategyView = (TextView) findViewById(R.id.enemy_fight_strategy);
        TextView enemyLootView = (TextView) findViewById(R.id.enemy_loot);

        String enemyName = i.getStringExtra(ENEMY_NAME);
        String enemyDesc = i.getStringExtra(ENEMY_DESCRIPTION);
        String enemyFightStrategy = i.getStringExtra(ENEMY_FIGHT_STRATEGY);
        String enemyLoot = i.getStringExtra(ENEMY_LOOT);

        enemyNameView.setText(enemyName);
        enemyDescView.setText(enemyDesc);
        enemyFightStrategyView.setText(enemyFightStrategy);
        enemyLootView.setText(enemyLoot);
    }
}
