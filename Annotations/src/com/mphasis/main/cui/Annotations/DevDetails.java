package com.mphasis.main.cui.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.METHOD,ElementType.TYPE})
public @interface DevDetails {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBty() default "N/A";
    String[] reviewers();
}
