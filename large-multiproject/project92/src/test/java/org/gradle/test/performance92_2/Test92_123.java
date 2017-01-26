package org.gradle.test.performance92_2;

import static org.junit.Assert.*;

public class Test92_123 {
    private final Production92_123 production = new Production92_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}