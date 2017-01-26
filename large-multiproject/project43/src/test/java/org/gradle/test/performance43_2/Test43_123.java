package org.gradle.test.performance43_2;

import static org.junit.Assert.*;

public class Test43_123 {
    private final Production43_123 production = new Production43_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}