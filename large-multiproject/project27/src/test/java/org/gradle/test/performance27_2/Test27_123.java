package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_123 {
    private final Production27_123 production = new Production27_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}