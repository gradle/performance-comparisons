package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_113 {
    private final Production40_113 production = new Production40_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}