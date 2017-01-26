package org.gradle.test.performance22_2;

import static org.junit.Assert.*;

public class Test22_123 {
    private final Production22_123 production = new Production22_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}