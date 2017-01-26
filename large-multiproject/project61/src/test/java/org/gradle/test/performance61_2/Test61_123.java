package org.gradle.test.performance61_2;

import static org.junit.Assert.*;

public class Test61_123 {
    private final Production61_123 production = new Production61_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}