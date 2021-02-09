package org.ppl.core.reflection.java.annotation;

import java.lang.annotation.*;

@Documented
@Retention ( RetentionPolicy.RUNTIME )
@Target ( ElementType.PARAMETER )

public @interface PPLCommandInputArgument {
    PPLObjectReference objectReference();
}
