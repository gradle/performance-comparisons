package org.gradle.test.performance3_5;

import static org.junit.Assert.*;

public class Test3_463 {
    private final Production3_463 production = new Production3_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}