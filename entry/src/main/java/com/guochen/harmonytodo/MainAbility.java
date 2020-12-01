package com.guochen.harmonytodo;

import com.guochen.harmonytodo.slice.ListAbilitySlice;
import com.guochen.harmonytodo.slice.ListDetailAbilitySlice;
import com.guochen.harmonytodo.slice.MainAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbilitySlice.class.getName());
        addActionRoute("entry.home.list", ListAbilitySlice.class.getName());
        addActionRoute("entry.home.list.detail", ListDetailAbilitySlice.class.getName());
    }
}
