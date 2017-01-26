package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_123 {
    private final Production45_123 production = new Production45_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}