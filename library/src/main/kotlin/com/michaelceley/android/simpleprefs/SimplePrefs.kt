package com.michaelceley.android.simpleprefs

import android.content.Context
import android.content.SharedPreferences

object SimplePrefs {

    private const val DEFAULT_PREFS = "com.michaelceley.android.simpleprefs.DEFAULT_PREFS"

    private var prefs: SharedPreferences? = null

    fun init(context: Context) {
        if(prefs == null) {
            prefs = context.applicationContext?.getSharedPreferences(DEFAULT_PREFS, Context.MODE_PRIVATE)
        }
    }

    fun getString(key: String) : String? {
        return prefs?.getString(key, null)
    }

    fun getStringSet(key: String) : Set<String>? {
        return prefs?.getStringSet(key, null)
    }

    fun getInt(key: String) : Int? {
        return if(prefs?.contains(key) == true) {
            prefs?.getInt(key, -1)
        } else null
    }

    fun getLong(key: String) : Long? {
        return if(prefs?.contains(key) == true) {
            prefs?.getLong(key, -1L)
        } else null
    }

    fun getFloat(key: String) : Float? {
        return if(prefs?.contains(key) == true) {
            prefs?.getFloat(key, -1.0f)
        } else null
    }

    fun getBoolean(key: String) : Boolean? {
        return if(prefs?.contains(key) == true) {
            prefs?.getBoolean(key, false)
        } else null
    }

    fun put(key: String, value: String?) {
        if(value == null) {
            prefs?.edit()?.remove(key)?.apply()
        } else {
            prefs?.edit()?.putString(key, value)?.apply()
        }
    }

    fun put(key: String, value: Set<String>?) {
        if(value == null) {
            prefs?.edit()?.remove(key)?.apply()
        } else {
            prefs?.edit()?.putStringSet(key, value)?.apply()
        }
    }

    fun put(key: String, value: Int?) {
        if(value == null) {
            prefs?.edit()?.remove(key)?.apply()
        } else {
            prefs?.edit()?.putInt(key, value)?.apply()
        }
    }

    fun put(key: String, value: Long?) {
        if(value == null) {
            prefs?.edit()?.remove(key)?.apply()
        } else {
            prefs?.edit()?.putLong(key, value)?.apply()
        }
    }

    fun put(key: String, value: Float?) {
        if(value == null) {
            prefs?.edit()?.remove(key)?.apply()
        } else {
            prefs?.edit()?.putFloat(key, value)?.apply()
        }
    }

    fun put(key: String, value: Boolean?) {
        if(value == null) {
            prefs?.edit()?.remove(key)?.apply()
        } else {
            prefs?.edit()?.putBoolean(key, value)?.apply()
        }
    }
}