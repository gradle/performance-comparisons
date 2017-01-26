package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_340 {
    private final Production48_340 production = new Production48_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}