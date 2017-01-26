package org.gradle.test.performance48_3;

import static org.junit.Assert.*;

public class Test48_256 {
    private final Production48_256 production = new Production48_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}