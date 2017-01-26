package org.gradle.test.performance4_5;

import static org.junit.Assert.*;

public class Test4_463 {
    private final Production4_463 production = new Production4_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}