package com.olku.annotations;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

/** Rx Observable results. */
@Retention(SOURCE)
@StringDef({RetRx.EMPTY, RetRx.ERROR})
public @interface RetRx {
    /** empty observable. */
    String EMPTY = "empty";
    /** error raising. */
    String ERROR = "error";
}
