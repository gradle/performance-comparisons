package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_30 {
    private final Production40_30 production = new Production40_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}