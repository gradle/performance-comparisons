package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_456 {
    private final Production22_456 production = new Production22_456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}