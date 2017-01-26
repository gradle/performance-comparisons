package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_494 {
    private final Production22_494 production = new Production22_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}