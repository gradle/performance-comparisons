package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_438 {
    private final Production48_438 production = new Production48_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}