package org.gradle.test.performance63_2;

import static org.junit.Assert.*;

public class Test63_123 {
    private final Production63_123 production = new Production63_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}