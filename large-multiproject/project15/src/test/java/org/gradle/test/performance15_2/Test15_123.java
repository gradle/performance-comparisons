package org.gradle.test.performance15_2;

import static org.junit.Assert.*;

public class Test15_123 {
    private final Production15_123 production = new Production15_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}