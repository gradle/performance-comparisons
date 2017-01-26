package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_131 {
    private final Production40_131 production = new Production40_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}