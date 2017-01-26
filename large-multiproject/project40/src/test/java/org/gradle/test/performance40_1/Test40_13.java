package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_13 {
    private final Production40_13 production = new Production40_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}