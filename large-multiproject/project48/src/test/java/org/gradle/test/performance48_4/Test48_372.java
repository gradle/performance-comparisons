package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_372 {
    private final Production48_372 production = new Production48_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}