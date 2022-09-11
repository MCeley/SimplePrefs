package com.michaelceley.android.simpleprefs

import android.content.Context

fun Context.getPrefString(key: String) : String? {
    SimplePrefs.init(this)
    return SimplePrefs.getString(key)
}

fun Context.getPrefStringSet(key: String) : Set<String>? {
    SimplePrefs.init(this)
    return SimplePrefs.getStringSet(key)
}

fun Context.getPrefInt(key: String) : Int? {
    SimplePrefs.init(this)
    return SimplePrefs.getInt(key)
}

fun Context.getPrefLong(key: String) : Long? {
    SimplePrefs.init(this)
    return SimplePrefs.getLong(key)
}

fun Context.getPrefFloat(key: String) : Float? {
    SimplePrefs.init(this)
    return SimplePrefs.getFloat(key)
}

fun Context.getPrefBoolean(key: String) : Boolean? {
    SimplePrefs.init(this)
    return SimplePrefs.getBoolean(key)
}

fun Context.putPref(key: String, value: String?) : Context {
    SimplePrefs.init(this)
    SimplePrefs.put(key, value)
    return this
}

fun Context.putPref(key: String, value: Set<String>?) : Context {
    SimplePrefs.init(this)
    SimplePrefs.put(key, value)
    return this
}

fun Context.putPref(key: String, value: Int?) : Context {
    SimplePrefs.init(this)
    SimplePrefs.put(key, value)
    return this
}

fun Context.putPref(key: String, value: Long?) : Context {
    SimplePrefs.init(this)
    SimplePrefs.put(key, value)
    return this
}

fun Context.putPref(key: String, value: Float?) : Context {
    SimplePrefs.init(this)
    SimplePrefs.put(key, value)
    return this
}

fun Context.putPref(key: String, value: Boolean?) : Context {
    SimplePrefs.init(this)
    SimplePrefs.put(key, value)
    return this
}