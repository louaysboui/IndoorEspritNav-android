package com.indooratlas.android.sdk.examples;

import androidx.annotation.StringRes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**

 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SdkExample {

    /**

     */
    @StringRes int title() default -1;

    /**

     */
    @StringRes int description();

}
