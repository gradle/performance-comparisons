package org.gradle.test.performance49_2;

import static org.junit.Assert.*;

public class Test49_123 {
    private final Production49_123 production = new Production49_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}