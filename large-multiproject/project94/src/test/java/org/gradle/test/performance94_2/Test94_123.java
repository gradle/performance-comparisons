package org.gradle.test.performance94_2;

import static org.junit.Assert.*;

public class Test94_123 {
    private final Production94_123 production = new Production94_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}