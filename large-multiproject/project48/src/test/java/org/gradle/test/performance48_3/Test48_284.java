package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_284 {
    private final Production48_284 production = new Production48_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}