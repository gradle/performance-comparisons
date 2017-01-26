package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_344 {
    private final Production48_344 production = new Production48_344("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}