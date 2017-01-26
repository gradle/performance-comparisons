package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_123 {
    private final Production89_123 production = new Production89_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}