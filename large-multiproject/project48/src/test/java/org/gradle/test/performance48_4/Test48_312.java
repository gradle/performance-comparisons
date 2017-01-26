package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_312 {
    private final Production48_312 production = new Production48_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}