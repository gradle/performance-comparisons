package org.gradle.test.performance48_4;

import static org.junit.Assert.*;

public class Test48_332 {
    private final Production48_332 production = new Production48_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}