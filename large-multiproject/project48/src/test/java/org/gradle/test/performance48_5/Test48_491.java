package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_491 {
    private final Production48_491 production = new Production48_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}