package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_368 {
    private final Production40_368 production = new Production40_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}