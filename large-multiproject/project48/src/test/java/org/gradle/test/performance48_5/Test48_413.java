package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_413 {
    private final Production48_413 production = new Production48_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}