package org.ppl.core.error.java;

import org.ppl.core.error.anticipated.ty_anticipated_error;

public class AnticipatedRuntimeErrorWrapperException extends Exception {

    final public ty_anticipated_error PPLError;

    public AnticipatedRuntimeErrorWrapperException ( ty_anticipated_error i_PPLError ) {
        this.PPLError = i_PPLError;
    }
}
