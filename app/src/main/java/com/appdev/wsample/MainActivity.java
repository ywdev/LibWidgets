package com.appdev.wsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.appdev.lib.widgets.titlebar.CommonTitleBar;
import com.appdev.lib.widgets.titlebar.listener.OnMoreActionItemClickListener;
import com.appdev.lib.widgets.titlebar.model.MoreAction;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<MoreAction> moreActions = new ArrayList<>();
        moreActions.add(new MoreAction("H",R.drawable.icon_title_search));
        moreActions.add(new MoreAction("B",R.drawable.icon_title_add));
        CommonTitleBar commonTitleBar = findViewById(R.id.ctb_title_bar);
        commonTitleBar.setActions(moreActions, new OnMoreActionItemClickListener() {
            @Override
            public void OnMoreActionItemClick(MoreAction moreAction, View view, int position) {

            }
        });
    }
}
