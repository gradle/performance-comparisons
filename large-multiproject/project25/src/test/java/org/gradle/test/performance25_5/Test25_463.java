package org.gradle.test.performance25_5;

import static org.junit.Assert.*;

public class Test25_463 {
    private final Production25_463 production = new Production25_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}