package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_463 {
    private final Production18_463 production = new Production18_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}