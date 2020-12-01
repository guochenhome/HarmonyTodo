package com.guochen.harmonytodo.slice;

import com.guochen.harmonytodo.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.Text;

public class ListAbilitySlice extends AbilitySlice {

    Text id_list;
    @Override
    protected void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_list);

        id_list=(Text)findComponentById(ResourceTable.Id_text_list);

        id_list.setText("点个大西瓜？");

        id_list.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                  presentForResult(new ListDetailAbilitySlice(),new Intent(),10001);
            }
        });

    }

    @Override
    protected void onActive() {
        super.onActive();
    }
}
