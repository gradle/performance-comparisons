package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_276 {
    private final Production48_276 production = new Production48_276("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}