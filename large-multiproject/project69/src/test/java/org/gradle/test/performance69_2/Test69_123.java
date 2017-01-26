package org.gradle.test.performance69_2;

import static org.junit.Assert.*;

public class Test69_123 {
    private final Production69_123 production = new Production69_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}