package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_108 {
    private final Production40_108 production = new Production40_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}