package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_123 {
    private final Production5_123 production = new Production5_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}