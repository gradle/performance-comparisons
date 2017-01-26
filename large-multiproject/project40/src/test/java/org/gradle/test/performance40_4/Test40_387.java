package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_387 {
    private final Production40_387 production = new Production40_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}