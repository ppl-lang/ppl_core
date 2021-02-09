package org.ppl.core.reflection.java.annotation;

import java.lang.annotation.*;

@Documented
@Retention( RetentionPolicy.RUNTIME )
@Target( {ElementType.METHOD, ElementType.PARAMETER} )

/* TD
    Currently not used
    Should be used and functions type() and nullable() should be removed in PPLObjectReference
*/

public @interface PPLObjectType {
    boolean nullable() default false;
    char kind() default 'S'; // S(tandard), E(numerated), G(enerified), P(arameter, type) U(nion)
    String sourceCode() default "";
}
