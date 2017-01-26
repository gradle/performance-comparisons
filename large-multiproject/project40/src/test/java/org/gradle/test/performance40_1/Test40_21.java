package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_21 {
    private final Production40_21 production = new Production40_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}