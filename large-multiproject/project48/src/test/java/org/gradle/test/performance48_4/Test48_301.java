package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_301 {
    private final Production48_301 production = new Production48_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}