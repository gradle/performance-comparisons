package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_448 {
    private final Production48_448 production = new Production48_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}