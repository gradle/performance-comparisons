package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_479 {
    private final Production40_479 production = new Production40_479("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}