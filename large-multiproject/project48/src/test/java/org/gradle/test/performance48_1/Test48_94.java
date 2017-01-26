package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_94 {
    private final Production48_94 production = new Production48_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}