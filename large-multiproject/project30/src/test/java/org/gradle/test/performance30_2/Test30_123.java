package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_123 {
    private final Production30_123 production = new Production30_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}