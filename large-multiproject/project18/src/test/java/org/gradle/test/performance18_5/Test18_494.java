package org.gradle.test.performance18_5;

import static org.junit.Assert.*;

public class Test18_494 {
    private final Production18_494 production = new Production18_494("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}