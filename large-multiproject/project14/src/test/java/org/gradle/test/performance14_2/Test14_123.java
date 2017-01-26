package org.gradle.test.performance14_2;

import static org.junit.Assert.*;

public class Test14_123 {
    private final Production14_123 production = new Production14_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}