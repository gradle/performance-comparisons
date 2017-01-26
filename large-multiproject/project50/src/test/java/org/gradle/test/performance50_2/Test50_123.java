package org.gradle.test.performance50_2;

import static org.junit.Assert.*;

public class Test50_123 {
    private final Production50_123 production = new Production50_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}