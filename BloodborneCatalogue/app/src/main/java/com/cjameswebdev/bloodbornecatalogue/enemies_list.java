package com.cjameswebdev.bloodbornecatalogue;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class enemies_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enemies_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView enemyList = (ListView) findViewById(R.id.enemy_list);
        if(enemyList != null) {
            enemyList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
                    CharSequence s = ((TextView) view).getText();
                    String enemyName = s.toString();
                    long imgId;
                    String enemyDescription = "";
                    String enemyFightStrategy = "";
                    String enemyLoot = "";

                    switch(enemyName) {
                        case "Beast Patient":
                            enemyDescription = getText(R.string.beast_patient_description).toString();
                            enemyFightStrategy = getText(R.string.beast_patient_fight_strategy).toString();
                            enemyLoot = getText(R.string.beast_patient_items_loot).toString();
                            break;
                        case "Beast Possessed Soul":
                            enemyDescription = getText(R.string.beast_possessed_soul_description).toString();
                            enemyFightStrategy = getText(R.string.beast_possessed_soul_fight_strategy).toString();
                            enemyLoot = getText(R.string.beast_possessed_soul_items_loot).toString();
                            break;
                        case "Bloodlicker":
                            enemyDescription = getText(R.string.bloodlicker_description).toString();
                            enemyFightStrategy = getText(R.string.bloodlicker_fight_strategy).toString();
                            enemyLoot = getText(R.string.bloodlicker_items_loot).toString();
                            break;
                        case "Brain of Mensis":
                            enemyDescription = getText(R.string.brain_of_mensis_description).toString();
                            enemyFightStrategy = getText(R.string.brain_of_mensis_fight_strategy).toString();
                            enemyLoot = getText(R.string.brain_of_mensis_items_loot).toString();
                            break;
                        case "Brainsucker":
                            enemyDescription = getText(R.string.brainsucker_description).toString();
                            enemyFightStrategy = getText(R.string.brainsucker_fight_strategy).toString();
                            enemyLoot = getText(R.string.brainsucker_items_loot).toString();
                            break;
                        case "Cainhurst Gargoyle":
                            enemyDescription = getText(R.string.cainhurst_gargoyle_description).toString();
                            enemyFightStrategy = getText(R.string.cainhurst_gargoyle_fight_strategy).toString();
                            enemyLoot = getText(R.string.cainhurst_gargoyle_items_loot).toString();
                            break;
                        case "Cainhurst Servant":
                            enemyDescription = getText(R.string.cainhurst_servant_description).toString();
                            enemyFightStrategy = getText(R.string.cainhurst_servant_fight_strategy).toString();
                            enemyLoot = getText(R.string.cainhurst_servant_items_loot).toString();
                            break;
                        case "Carrion Crow":
                            enemyDescription = getText(R.string.carrion_crow_description).toString();
                            enemyFightStrategy = getText(R.string.carrion_crow_fight_strategy).toString();
                            enemyLoot = getText(R.string.carrion_crow_items_loot).toString();
                            break;
                        case "Celestial Emissary":
                            enemyDescription = getText(R.string.enemy_celestial_emissary_description).toString();
                            enemyFightStrategy = getText(R.string.enemy_celestial_emissary_fight_strategy).toString();
                            enemyLoot = getText(R.string.enemy_celestial_emissary_items_loot).toString();
                            break;
                        case "Celestial Larvae":
                            enemyDescription = getText(R.string.celestial_larvae_description).toString();
                            enemyFightStrategy = getText(R.string.celestial_larvae_fight_strategy).toString();
                            enemyLoot = getText(R.string.celestial_larvae_items_loot).toString();
                            break;
                        case "Chime Maiden":
                            enemyDescription = getText(R.string.chime_maiden_description).toString();
                            enemyFightStrategy = getText(R.string.chime_maiden_fight_strategy).toString();
                            enemyLoot = getText(R.string.chime_maiden_items_loot).toString();
                            break;
                        case "Chapel Giant":
                            enemyDescription = getText(R.string.chapel_giant_description).toString();
                            enemyFightStrategy = getText(R.string.chapel_giant_fight_strategy).toString();
                            enemyLoot = getText(R.string.chapel_giant_items_loot).toString();
                            break;
                        case "Church Servant":
                            enemyDescription = getText(R.string.church_servant_description).toString();
                            enemyFightStrategy = getText(R.string.church_servant_fight_strategy).toString();
                            enemyLoot = getText(R.string.church_servant_items_loot).toString();
                            break;
                        case "Cramped Casket":
                            enemyDescription = getText(R.string.cramped_casket_description).toString();
                            enemyFightStrategy = getText(R.string.cramped_casket_fight_strategy).toString();
                            enemyLoot = getText(R.string.cramped_casket_items_loot).toString();
                            break;
                        case "Crawler":
                            enemyDescription = getText(R.string.crawler_description).toString();
                            enemyFightStrategy = getText(R.string.crawler_fight_strategy).toString();
                            enemyLoot = getText(R.string.crawler_items_loot).toString();
                            break;
                        case "Executioner":
                            enemyDescription = getText(R.string.executioner_description).toString();
                            enemyFightStrategy = getText(R.string.executioner_fight_strategy).toString();
                            enemyLoot = getText(R.string.executioner_items_loot).toString();
                            break;
                        case "Eye Collector":
                            enemyDescription = getText(R.string.eye_collector_description).toString();
                            enemyFightStrategy = getText(R.string.eye_collector_fight_strategy).toString();
                            enemyLoot = getText(R.string.eye_collector_items_loot).toString();
                            break;
                        case "Fluorescent Flower":
                            enemyDescription = getText(R.string.fluorescent_flower_description).toString();
                            enemyFightStrategy = getText(R.string.fluorescent_flower_fight_strategy).toString();
                            enemyLoot = getText(R.string.fluorescent_flower_items_loot).toString();
                            break;
                        case "Garden of Eyes":
                            enemyDescription = getText(R.string.garden_of_eyes_description).toString();
                            enemyFightStrategy = getText(R.string.garden_of_eyes_fight_strategy).toString();
                            enemyLoot = getText(R.string.garden_of_eyes_items_loot).toString();
                            break;
                        case "Giant Lost Child":
                            enemyDescription = getText(R.string.giant_lost_child_description).toString();
                            enemyFightStrategy = getText(R.string.giant_lost_child_fight_strategy).toString();
                            enemyLoot = getText(R.string.giant_lost_child_items_loot).toString();
                            break;
                        case "Giant Hog":
                            enemyDescription = getText(R.string.grave_hag_description).toString();
                            enemyFightStrategy = getText(R.string.grave_hag_fight_strategy).toString();
                            enemyLoot = getText(R.string.grave_hag_items_loot).toString();
                            break;
                        case "Hemwick Grave Hag":
                            enemyDescription = getText(R.string.grave_hag_description).toString();
                            enemyFightStrategy = getText(R.string.grave_hag_fight_strategy).toString();
                            enemyLoot = getText(R.string.grave_hag_items_loot).toString();
                            break;
                        case "Hound":
                            enemyDescription = getText(R.string.hound_description).toString();
                            enemyFightStrategy = getText(R.string.hound_fight_strategy).toString();
                            enemyLoot = getText(R.string.hound_items_loot).toString();
                            break;
                        case "Huntsman":
                            enemyDescription = getText(R.string.huntsman_description).toString();
                            enemyFightStrategy = getText(R.string.huntsman_fight_strategy).toString();
                            enemyLoot = getText(R.string.huntsman_items_loot).toString();
                            break;
                        case "Giant Rat":
                            enemyDescription = getText(R.string.giant_rat_description).toString();
                            enemyFightStrategy = getText(R.string.giant_rat_fight_strategy).toString();
                            enemyLoot = getText(R.string.giant_rat_items_loot).toString();
                            break;
                        case "Mad One":
                            enemyDescription = getText(R.string.mad_one_description).toString();
                            enemyFightStrategy = getText(R.string.mad_one_fight_strategy).toString();
                            enemyLoot = getText(R.string.mad_one_items_loot).toString();
                            break;
                        case "Mergo\'s Attendant":
                            enemyDescription = getText(R.string.mergos_attendant_description).toString();
                            enemyFightStrategy = getText(R.string.mergos_attendant_fight_strategy).toString();
                            enemyLoot = getText(R.string.mergos_attendant_items_loot).toString();
                            break;
                        case "Mergo\'s Chief Attendant":
                            enemyDescription = getText(R.string.mergos_chief_attendant_description).toString();
                            enemyFightStrategy = getText(R.string.mergos_chief_attendant_fight_strategy).toString();
                            enemyLoot = getText(R.string.mergos_chief_attendant_items_loot).toString();
                            break;
                        case "Nightmare Apostle":
                            enemyDescription = getText(R.string.nightmare_apostle_description).toString();
                            enemyFightStrategy = getText(R.string.nightmare_apostle_fight_strategy).toString();
                            enemyLoot = getText(R.string.nightmare_apostle_items_loot).toString();
                            break;
                        case "Hateful Maggot":
                            enemyDescription = getText(R.string.hateful_maggot_description).toString();
                            enemyFightStrategy = getText(R.string.hateful_maggot_fight_strategy).toString();
                            enemyLoot = getText(R.string.hateful_maggot_items_loot).toString();
                            break;
                        case "Rotted Corpse":
                            enemyDescription = getText(R.string.rotted_corpse_description).toString();
                            enemyFightStrategy = getText(R.string.rotted_corpse_fight_strategy).toString();
                            enemyLoot = getText(R.string.rotted_corpse_items_loot).toString();
                            break;
                        case "Scourge Beast":
                            enemyDescription = getText(R.string.scourge_beast_description).toString();
                            enemyFightStrategy = getText(R.string.scourge_beast_fight_strategy).toString();
                            enemyLoot = getText(R.string.scourge_beast_items_loot).toString();
                            break;
                        case "Silver Lady":
                            enemyDescription = getText(R.string.silver_lady_description).toString();
                            enemyFightStrategy = getText(R.string.silver_lady_fight_strategy).toString();
                            enemyLoot = getText(R.string.silver_lady_items_loot).toString();
                            break;
                        case "Slime Scholar":
                            enemyDescription = getText(R.string.slime_scholar_description).toString();
                            enemyFightStrategy = getText(R.string.slime_scholar_fight_strategy).toString();
                            enemyLoot = getText(R.string.slime_scholar_items_loot).toString();
                            break;
                        case "Shadow of Yharnam":
                            enemyDescription = getText(R.string.shadow_of_yharnam_description).toString();
                            enemyFightStrategy = getText(R.string.shadow_of_yharnam_fight_strategy).toString();
                            enemyLoot = getText(R.string.shadow_of_yharnam_items_loot).toString();
                            break;
                        case "Skeletal Puppet":
                            enemyDescription = getText(R.string.skeletal_puppet_description).toString();
                            enemyFightStrategy = getText(R.string.skeletal_puppet_fight_strategy).toString();
                            enemyLoot = getText(R.string.skeletal_puppet_items_loot).toString();
                            break;
                        case "Snatcher":
                            enemyDescription = getText(R.string.snatcher_description).toString();
                            enemyFightStrategy = getText(R.string.snatcher_fight_strategy).toString();
                            enemyLoot = getText(R.string.snatcher_items_loot).toString();
                            break;
                        case "Troll":
                            enemyDescription = getText(R.string.troll_description).toString();
                            enemyFightStrategy = getText(R.string.troll_fight_strategy).toString();
                            enemyLoot = getText(R.string.troll_items_loot).toString();
                            break;
                        case "Vermin Host":
                            enemyDescription = getText(R.string.vermin_host_description).toString();
                            enemyFightStrategy = getText(R.string.vermin_host_fight_strategy).toString();
                            enemyLoot = getText(R.string.vermin_host_items_loot).toString();
                            break;
                        case "Wheelchair Huntsman":
                            enemyDescription = getText(R.string.wheelchair_huntsman_description).toString();
                            enemyFightStrategy = getText(R.string.wheelchair_huntsman_fight_strategy).toString();
                            enemyLoot = getText(R.string.wheelchair_huntsman_items_loot).toString();
                            break;
                        case "Winter Lantern":
                            enemyDescription = getText(R.string.winter_lantern_description).toString();
                            enemyFightStrategy = getText(R.string.winter_lantern_fight_strategy).toString();
                            enemyLoot = getText(R.string.winter_lantern_items_loot).toString();
                            break;
                    }

                    Intent intent = new Intent(enemies_list.this, EnemyArticle.class);
                    intent.putExtra(EnemyArticle.ENEMY_NAME, enemyName);
                    intent.putExtra(EnemyArticle.ENEMY_DESCRIPTION, enemyDescription);
                    intent.putExtra(EnemyArticle.ENEMY_FIGHT_STRATEGY, enemyFightStrategy);
                    intent.putExtra(EnemyArticle.ENEMY_LOOT, enemyLoot);

                    startActivity(intent);
                }
            });
        }
    }

}
