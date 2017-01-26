package org.gradle.test.performance16_2;

import static org.junit.Assert.*;

public class Test16_123 {
    private final Production16_123 production = new Production16_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}