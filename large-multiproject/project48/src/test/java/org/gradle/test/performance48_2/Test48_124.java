package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_124 {
    private final Production48_124 production = new Production48_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}