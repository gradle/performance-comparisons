package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_463 {
    private final Production15_463 production = new Production15_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}