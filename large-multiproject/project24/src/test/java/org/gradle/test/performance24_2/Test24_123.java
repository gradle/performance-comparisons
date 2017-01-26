package org.gradle.test.performance24_2;

import static org.junit.Assert.*;

public class Test24_123 {
    private final Production24_123 production = new Production24_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}