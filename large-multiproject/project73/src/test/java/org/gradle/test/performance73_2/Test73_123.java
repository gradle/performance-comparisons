package org.gradle.test.performance73_2;

import static org.junit.Assert.*;

public class Test73_123 {
    private final Production73_123 production = new Production73_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}