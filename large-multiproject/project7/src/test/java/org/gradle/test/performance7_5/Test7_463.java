package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_463 {
    private final Production7_463 production = new Production7_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}