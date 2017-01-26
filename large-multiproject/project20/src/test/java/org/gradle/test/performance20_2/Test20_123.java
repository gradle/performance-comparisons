package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_123 {
    private final Production20_123 production = new Production20_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}