package org.gradle.test.performance48_2;

import static org.junit.Assert.*;

public class Test48_129 {
    private final Production48_129 production = new Production48_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}