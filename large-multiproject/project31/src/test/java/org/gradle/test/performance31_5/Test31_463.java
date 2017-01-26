package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_463 {
    private final Production31_463 production = new Production31_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}