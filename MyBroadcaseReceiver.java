/*
 * Copyright (c) 2015-2015 by Shanghai shootbox Information Technology Co., Ltd.
 * Create: 2015/9/17 0:22:31
 * Project: T_broadcast
 * File: MyBroadcaseReceiver.java
 * Class: MyBroadcaseReceiver
 * Module: app
 * Author: yangyankai
 * Version: 1.0
 */

/*
 * Copyright (c) 2015-2015 by Shanghai shootbox Information Technology Co., Ltd.
 * Create: 2015/9/16 3:38:45
 * Project: T
 * File: AlarmReceiver.java
 * Class: AlarmReceiver
 * Module: app
 * Author: yangyankai
 * Version: 1.0
 */

package com.mob.t_broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by yangyankai on 2015/9/16.
 */
public class MyBroadcaseReceiver extends BroadcastReceiver
{



	@Override
	public void onReceive(Context context, Intent intent)
	{

		Log.e("aaa"," MyBroadcastReceiver   receive");


//		Log.e("a", "receiver");


	}


}
