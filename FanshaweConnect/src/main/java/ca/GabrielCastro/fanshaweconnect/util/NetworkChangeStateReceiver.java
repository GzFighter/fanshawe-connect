/*
 * This file is part of FanshaweConnect.
 *
 * Copyright 2013 Gabriel Castro (c)
 *
 *     FanshaweConnect is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 2 of the License, or
 *     (at your option) any later version.
 *
 *     FanshaweConnect is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with FanshaweConnect.  If not, see <http://www.gnu.org/licenses/>.
 */

package ca.GabrielCastro.fanshaweconnect.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import ca.GabrielCastro.fanshawelogin.CONSTANTS;
import ca.GabrielCastro.fanshawelogin.util.StateChangeService;

public class NetworkChangeStateReceiver extends BroadcastReceiver implements CONSTANTS {

    private static final String TAG = "ChSate";

    @SuppressWarnings("deprecation")
    @Override
    public void onReceive(Context context, Intent intent) {
        context.startService(new Intent(context, StateChangeService.class).putExtra("", intent));
    }

}
