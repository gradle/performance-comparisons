package org.gradle.test.performance74_2;

import static org.junit.Assert.*;

public class Test74_123 {
    private final Production74_123 production = new Production74_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}