package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_473 {
    private final Production40_473 production = new Production40_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}