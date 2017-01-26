package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_463 {
    private final Production5_463 production = new Production5_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}