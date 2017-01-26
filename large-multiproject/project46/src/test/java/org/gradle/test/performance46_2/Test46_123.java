package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_123 {
    private final Production46_123 production = new Production46_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}