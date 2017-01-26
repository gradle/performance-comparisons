package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_449 {
    private final Production5_449 production = new Production5_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}