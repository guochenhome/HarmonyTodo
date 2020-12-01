package com.guochen.harmonytodo.slice;

import com.guochen.harmonytodo.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;

public class ListDetailAbilitySlice extends AbilitySlice {

    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        setUIContent(ResourceTable.Layout_ability_list_detail);
    }

    @Override
    protected void onActive() {
        super.onActive();
    }
}
