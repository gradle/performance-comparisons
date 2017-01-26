package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_449 {
    private final Production18_449 production = new Production18_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}