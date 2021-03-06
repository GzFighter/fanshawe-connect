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

package ca.GabrielCastro.betterpreferences.preftypes;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.os.Build;

import java.util.Set;

import ca.GabrielCastro.betterpreferences.BetterPreference;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class StringSetPreference extends BetterPreference<Set<String>> {

    public StringSetPreference(String key, Set<String> defValue) {
        super(key, defValue);
    }

    @Override
    public Set<String> readFromPrefs(SharedPreferences prefs) {
        return prefs.getStringSet(this.key, this.defVal);
    }

    @Override
    public void saveToPrefs(SharedPreferences.Editor editor, Set<String> val) {
        editor.putStringSet(this.key, val);
    }
}