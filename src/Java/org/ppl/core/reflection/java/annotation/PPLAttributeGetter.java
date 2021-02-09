package org.ppl.core.reflection.java.annotation;

import java.lang.annotation.*;

@Documented
@Retention ( RetentionPolicy.RUNTIME )
@Target ( ElementType.METHOD )

public @interface PPLAttributeGetter {
    PPLObjectReference objectReference();
    boolean isVariable() default false;
    int srcOrder() default 0;
}
