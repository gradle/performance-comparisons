package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_179 {
    private final Production40_179 production = new Production40_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}