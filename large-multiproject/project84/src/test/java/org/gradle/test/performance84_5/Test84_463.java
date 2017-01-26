package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_463 {
    private final Production84_463 production = new Production84_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}