package com.cjameswebdev.bloodbornecatalogue;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class boss_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final ListView bossList = (ListView) findViewById(R.id.boss_list);
        if (bossList != null) {
            bossList.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    CharSequence s = ((TextView) view).getText();
                    String bossName = s.toString();

                    long imgId;
                    String bossDescription = "";
                    String bossLore = "";
                    String bossFightStrategy = "";
                    String bossLoot = "";

                    switch(bossName) {
                        case "Amygdala":
                            bossDescription = getText(R.string.amygdala_description).toString();
                            bossLore = getText(R.string.amygdala_lore).toString();
                            bossFightStrategy = getText(R.string.amygdala_fight_strategy).toString();
                            bossLoot = getText(R.string.amygdala_loot).toString();
                            break;
                        case "Blood Starved Beast":
                            bossDescription = getText(R.string.blood_starved_beast_description).toString();
                            bossLore = getText(R.string.blood_starved_beast_lore).toString();
                            bossFightStrategy = getText(R.string.blood_starved_beast_fight_strategy).toString();
                            bossLoot = getText(R.string.blood_starved_beast_loot).toString();
                            break;
                        case "Celestial Emissary":
                            bossDescription = getText(R.string.celestial_emissary_description).toString();
                            bossLore = getText(R.string.celestial_emissary_lore).toString();
                            bossFightStrategy = getText(R.string.celestial_emissary_fight_strategy).toString();
                            bossLoot = getText(R.string.celestial_emissary_loot).toString();
                            break;
                        case "Cleric Beast":
                            bossDescription = getText(R.string.cleric_beast_description).toString();
                            bossLore = getText(R.string.cleric_beast_lore).toString();
                            bossFightStrategy = getText(R.string.cleric_beast_fight_strategy).toString();
                            bossLoot = getText(R.string.cleric_beast_loot).toString();
                            break;
                        case "Darkbeast Paarl":
                            bossDescription = getText(R.string.darkbeast_paarl_description).toString();
                            bossLore = getText(R.string.darkbeast_paarl_lore).toString();
                            bossFightStrategy = getText(R.string.darkbeast_paarl_fight_strategy).toString();
                            bossLoot = getText(R.string.darkbeast_paarl_loot).toString();
                            break;
                        case "Ebrietas, Daughter of the Cosmos":
                            bossDescription = getText(R.string.ebrietas_description).toString();
                            bossLore = getText(R.string.ebrietas_lore).toString();
                            bossFightStrategy = getText(R.string.ebrietas_fight_strategy).toString();
                            bossLoot = getText(R.string.ebrietas_loot).toString();
                            break;
                        case "Father Gascoigne":
                            bossDescription = getText(R.string.father_gascoigne_description).toString();
                            bossLore = getText(R.string.father_gascoigne_lore).toString();
                            bossFightStrategy = getText(R.string.father_gascoigne_fight_strategy).toString();
                            bossLoot = getText(R.string.father_gascoigne_loot).toString();
                            break;
                        case "Gehrman, The Old Hunter":
                            bossDescription = getText(R.string.boss_gehrman_description).toString();
                            bossLore = getText(R.string.gehrman_lore).toString();
                            bossFightStrategy = getText(R.string.gehrman_fight_strategy).toString();
                            bossLoot = getText(R.string.gehrman_loot).toString();
                            break;
                        case "Martyr Logarius":
                            bossDescription = getText(R.string.logarius_description).toString();
                            bossLore = getText(R.string.logarius_lore).toString();
                            bossFightStrategy = getText(R.string.logarius_fight_strategy).toString();
                            bossLoot = getText(R.string.logarius_loot).toString();
                            break;
                        case "Mergo\'s Wet Nurse":
                            bossDescription = getText(R.string.mergo_description).toString();
                            bossLore = getText(R.string.mergo_lore).toString();
                            bossFightStrategy = getText(R.string.mergo_fight_strategy).toString();
                            bossLoot = getText(R.string.mergo_loot).toString();
                            break;
                        case "Micolash, Host of the Nightmare":
                            bossDescription = getText(R.string.micolash_description).toString();
                            bossLore = getText(R.string.micolash_lore).toString();
                            bossFightStrategy = getText(R.string.micolash_fight_strategy).toString();
                            bossLoot = getText(R.string.micolash_loot).toString();
                            break;
                        case "Moon Presence":
                            bossDescription = getText(R.string.moon_presence_description).toString();
                            bossLore = getText(R.string.moon_presence_lore).toString();
                            bossFightStrategy = getText(R.string.moon_presence_fight_strategy).toString();
                            bossLoot = getText(R.string.moon_presence_loot).toString();
                            break;
                        case "One Reborn":
                            bossDescription = getText(R.string.one_reborn_description).toString();
                            bossLore = getText(R.string.one_reborn_lore).toString();
                            bossFightStrategy = getText(R.string.one_reborn_fight_strategy).toString();
                            bossLoot = getText(R.string.one_reborn_loot).toString();
                            break;
                        case "Rom, the Vacuous Spider":
                            bossDescription = getText(R.string.rom_description).toString();
                            bossLore = getText(R.string.rom_lore).toString();
                            bossFightStrategy = getText(R.string.rom_fight_strategy).toString();
                            bossLoot = getText(R.string.rom_loot).toString();
                            break;
                        case "Shadows of Yharnam":
                            bossDescription = getText(R.string.shadows_of_yharnam_description).toString();
                            bossLore = getText(R.string.shadows_of_yharnam_lore).toString();
                            bossFightStrategy = getText(R.string.shadows_of_yharnam_fight_strategy).toString();
                            bossLoot = getText(R.string.shadows_of_yharnam_loot).toString();
                            break;
                        case "Vicar Amelia":
                            bossDescription = getText(R.string.vicar_amelia_description).toString();
                            bossLore = getText(R.string.vicar_amelia_lore).toString();
                            bossFightStrategy = getText(R.string.vicar_amelia_fight_strategy).toString();
                            bossLoot = getText(R.string.vicar_amelia_loot).toString();
                            break;
                        case "Witch of Hemwick":
                            bossDescription = getText(R.string.witch_of_hemwick_description).toString();
                            bossLore = getText(R.string.witch_of_hemwick_lore).toString();
                            bossFightStrategy = getText(R.string.witch_of_hemwick_fight_strategy).toString();
                            bossLoot = getText(R.string.witch_of_hemwick_loot).toString();
                            break;
                    }


                    Intent intent = new Intent(boss_list.this, BossArticle.class);
                    intent.putExtra(BossArticle.BOSS_NAME, bossName);
                    intent.putExtra(BossArticle.BOSS_DESCRIPTION, bossDescription);
                    intent.putExtra(BossArticle.BOSS_LORE, bossLore);
                    intent.putExtra(BossArticle.BOSS_FIGHT_STRATEGY, bossFightStrategy);
                    intent.putExtra(BossArticle.BOSS_LOOT, bossLoot);

                    startActivity(intent);
                }
            });
        }
    }

}
