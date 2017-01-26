package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_250 {
    private final Production48_250 production = new Production48_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}