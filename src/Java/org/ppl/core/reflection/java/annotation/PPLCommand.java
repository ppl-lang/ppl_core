package org.ppl.core.reflection.java.annotation;

import java.lang.annotation.*;

@Documented
@Retention ( RetentionPolicy.RUNTIME )
@Target ( ElementType.METHOD )

public @interface PPLCommand {
    boolean isCreator() default false;
    PPLObjectReference[] outputArguments() default {};
    String inCheckCode() default "";
    String outCheckCode() default "";
}
