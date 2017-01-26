package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_333 {
    private final Production40_333 production = new Production40_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}