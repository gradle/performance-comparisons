package org.gradle.test.performance44_2;

import static org.junit.Assert.*;

public class Test44_123 {
    private final Production44_123 production = new Production44_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}