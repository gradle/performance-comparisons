package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_115 {
    private final Production40_115 production = new Production40_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}