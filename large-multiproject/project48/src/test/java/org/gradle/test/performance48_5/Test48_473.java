package org.gradle.test.performance48_5;

import static org.junit.Assert.*;

public class Test48_473 {
    private final Production48_473 production = new Production48_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}