package com.plter.closingactivity;

import android.app.AlertDialog;
import android.content.DialogInterface;

import com.plter.game2d.display.Game2DActivity;
import com.plter.game2d.events.EventListener;
import com.plter.game2d.events.Game2DActivityEvent;

public class MainActivity extends Game2DActivity {

	@Override
	protected void onGame2DCreationComplete() {
		
		closing.add(new EventListener<Game2DActivityEvent>() {
			
			@Override
			public boolean onReceive(Game2DActivityEvent arg0, Object arg1) {
				
				new AlertDialog.Builder(MainActivity.this).setTitle("你好").setMessage("你真的要退出吗？").setPositiveButton("是", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						System.exit(0);
					}
				}).setNegativeButton("否", null).show();
				
				return false;
			}
		});
	}
}
