package org.gradle.test.performance48_1;

import static org.junit.Assert.*;

public class Test48_23 {
    private final Production48_23 production = new Production48_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}