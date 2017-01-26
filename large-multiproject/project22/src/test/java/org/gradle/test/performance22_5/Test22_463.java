package org.gradle.test.performance22_5;

import static org.junit.Assert.*;

public class Test22_463 {
    private final Production22_463 production = new Production22_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}