package org.ppl.core.reflection.java.annotation;

import java.lang.annotation.*;

@Documented
@Retention ( RetentionPolicy.RUNTIME )
@Target ( {ElementType.METHOD, ElementType.PARAMETER} )

public @interface PPLObjectReference {
    String id();
    String type() default "";
    boolean nullable() default false;
    String checkCode() default "";
    String defaultCode() default "";
}
