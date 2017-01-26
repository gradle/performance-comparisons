package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_132 {
    private final Production48_132 production = new Production48_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}