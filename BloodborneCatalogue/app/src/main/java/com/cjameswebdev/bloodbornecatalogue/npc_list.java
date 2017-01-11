package com.cjameswebdev.bloodbornecatalogue;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class npc_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_npc_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ListView npcList = (ListView) findViewById(R.id.npc_list_view);
            if (npcList != null) {
                npcList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        // store view in a TextView variable(use String var = ((TextView) view).getText())
                        CharSequence s = ((TextView) view).getText();
                        String npcName = s.toString();

                        // Set up data variables that will be sent to npc_article.class
                        // imgId will need to be set up when drawables_npc_img is set up
                        long imgId;
                        String npcDescription = "";
                        String npcItems = "";
                        String npcLoreGuide = "";

                        // switch statement here, determining what data to pass through depending on
                        // what String is passed to it. Store data to above variables

                        // All these resource values can be found in NPC_strings.xml
                        switch (npcName) {
                            case "Adella the Nun":
                                // set variable data
                                npcDescription = getText(R.string.adella_description).toString();
                                npcItems = getText(R.string.adella_items).toString();
                                npcLoreGuide = getText(R.string.adella_quest_guide).toString();
                                break;
                            case "Afflicted Beggar":
                                npcDescription = getText(R.string.afflicted_beggar_description).toString();
                                npcItems = getText(R.string.afflicted_beggar_items).toString();
                                npcLoreGuide = getText(R.string.afflicted_beggar_quest_guide).toString();
                                // set variable data
                                break;
                            case "Alfred, Hunter of VileBloods":
                                npcDescription = getText(R.string.alfred_description).toString();
                                npcItems = getText(R.string.alfred_items).toString();
                                npcLoreGuide = getText(R.string.alfred_quest_guide).toString();
                                // set variable data
                                break;
                            case "Annalise, Queen of the VileBloods":
                                npcDescription = getText(R.string.annalise_description).toString();
                                npcItems = getText(R.string.annalise_items).toString();
                                npcLoreGuide = getText(R.string.annalise_quest_guide).toString();
                                // set variable data
                                break;
                            case "Arianna, Lady of the Night":
                                npcDescription = getText(R.string.arianna_description).toString();
                                npcItems = getText(R.string.arianna_items).toString();
                                npcLoreGuide = getText(R.string.arianna_quest_guide).toString();
                                // set variable data
                                break;
                            case "Blood Minister":
                                npcDescription = getText(R.string.blood_minister_description).toString();
                                npcItems = getText(R.string.blood_minister_items).toString();
                                npcLoreGuide = getText(R.string.blood_minister_quest_guide).toString();
                                // set variable data
                                break;
                            case "Chapel Dweller":
                                npcDescription = getText(R.string.chapel_dweller_description).toString();
                                npcItems = getText(R.string.chapel_dweller_items).toString();
                                npcLoreGuide = getText(R.string.chapel_dweller_quest_guide).toString();
                                // set variable data
                                break;
                            case "Doll":
                                npcDescription = getText(R.string.doll_description).toString();
                                npcItems = getText(R.string.doll_items).toString();
                                npcLoreGuide = getText(R.string.doll_quest_guide).toString();
                                // set variable data
                                break;
                            case "Eileen the Crow":
                                npcDescription = getText(R.string.eileen_description).toString();
                                npcItems = getText(R.string.eileen_items).toString();
                                npcLoreGuide = getText(R.string.eileen_quest_guide).toString();
                                // set variable data
                                break;
                            case "Gilbert":
                                npcDescription = getText(R.string.gilbert_description).toString();
                                npcItems = getText(R.string.gilbert_items).toString();
                                npcLoreGuide = getText(R.string.gilbert_quest_guide).toString();
                                // set variable data
                                break;
                            case "Iosefka":
                                npcDescription = getText(R.string.iosefka_description).toString();
                                npcItems = getText(R.string.iosefka_items).toString();
                                npcLoreGuide = getText(R.string.iosefka_quest_guide).toString();
                                // set variable data
                                break;
                            case "Lonely Old Woman":
                                npcDescription = getText(R.string.old_woman_description).toString();
                                npcItems = getText(R.string.old_woman_items).toString();
                                npcLoreGuide = getText(R.string.old_woman_quest_guide).toString();
                                // set variable data
                                break;
                            case "Narrow Minded Man":
                                npcDescription = getText(R.string.narrow_minded_man_description).toString();
                                npcItems = getText(R.string.narrow_minded_man_items).toString();
                                npcLoreGuide = getText(R.string.narrow_minded_man_quest_guide).toString();
                                // set variable data
                                break;
                            case "Old Hunter Gehrman":
                                npcDescription = getText(R.string.gehrman_description).toString();
                                npcItems = getText(R.string.gehrman_items).toString();
                                npcLoreGuide = getText(R.string.gehrman_quest_guide).toString();
                                // set variable data
                                break;
                            case "Patches the Spider":
                                npcDescription = getText(R.string.patches_description).toString();
                                npcItems = getText(R.string.patches_items).toString();
                                npcLoreGuide = getText(R.string.patches_quest_guide).toString();
                                // set variable data
                                break;
                            case "Provost Willem":
                                npcDescription = getText(R.string.willem_description).toString();
                                npcItems = getText(R.string.willem_items).toString();
                                npcLoreGuide = getText(R.string.willem_quest_guide).toString();
                                // set variable data
                                break;
                            case "Retired Hunter Djura":
                                npcDescription = getText(R.string.djura_description).toString();
                                npcItems = getText(R.string.djura_items).toString();
                                npcLoreGuide = getText(R.string.djura_quest_guide).toString();
                                // set variable data
                                break;
                            case "Valtr":
                                npcDescription = getText(R.string.valtr_description).toString();
                                npcItems = getText(R.string.valtr_items).toString();
                                npcLoreGuide = getText(R.string.valtr_quest_guide).toString();
                                // set variable data
                                break;
                            case "Young Girl and Older Sister":
                                npcDescription = getText(R.string.yg_ls_description).toString();
                                npcItems = getText(R.string.yg_ls_items).toString();
                                npcLoreGuide = getText(R.string.yg_ls_quest_guide).toString();
                                // set variable data
                                break;
                        }

                        // Create new Intent to open npc article activity
                        Intent i = new Intent(npc_list.this, npc_article.class);

                        // Add extras (npc_img, npc_description, npc_items, npc_lore_guide)
                        i.putExtra(npc_article.NPC_NAME, npcName);
                        i.putExtra(npc_article.NPC_DESCRIPTION, npcDescription);
                        i.putExtra(npc_article.NPC_ITEMS, npcItems);
                        i.putExtra(npc_article.NPC_LORE_GUIDE, npcLoreGuide);
                        // startActivity here
                        startActivity(i);

                        // Hopefully this strategy works.....
                    }
                });
            }
    }
}