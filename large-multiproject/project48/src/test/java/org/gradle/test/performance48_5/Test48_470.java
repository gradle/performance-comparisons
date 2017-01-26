package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_470 {
    private final Production48_470 production = new Production48_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}