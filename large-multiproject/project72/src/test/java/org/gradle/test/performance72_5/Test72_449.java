package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_449 {
    private final Production72_449 production = new Production72_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}