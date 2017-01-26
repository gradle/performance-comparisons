package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_352 {
    private final Production48_352 production = new Production48_352("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}