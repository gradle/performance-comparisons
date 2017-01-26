package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_349 {
    private final Production48_349 production = new Production48_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}