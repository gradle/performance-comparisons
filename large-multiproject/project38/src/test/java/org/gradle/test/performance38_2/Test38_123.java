package org.gradle.test.performance38_2;

import static org.junit.Assert.*;

public class Test38_123 {
    private final Production38_123 production = new Production38_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}