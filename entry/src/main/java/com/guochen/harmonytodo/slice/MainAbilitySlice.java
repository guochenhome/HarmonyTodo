package com.guochen.harmonytodo.slice;

import com.guochen.harmonytodo.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.Text;

public class MainAbilitySlice extends AbilitySlice {

    Text hell_text;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);

       hell_text=(Text) findComponentById(ResourceTable.Id_text_helloworld);

       hell_text.setClickedListener(new Component.ClickedListener() {
           @Override
           public void onClick(Component component) {
               present(new ListAbilitySlice(),new Intent());
           }
       });

    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
