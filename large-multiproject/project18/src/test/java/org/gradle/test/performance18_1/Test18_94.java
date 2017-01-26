package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_94 {
    private final Production18_94 production = new Production18_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}