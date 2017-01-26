package org.gradle.test.performance18_2;

import static org.junit.Assert.*;

public class Test18_123 {
    private final Production18_123 production = new Production18_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}