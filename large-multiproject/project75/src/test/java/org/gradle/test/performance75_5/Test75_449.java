package org.gradle.test.performance75_5;

import static org.junit.Assert.*;

public class Test75_449 {
    private final Production75_449 production = new Production75_449("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}