package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_463 {
    private final Production20_463 production = new Production20_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}