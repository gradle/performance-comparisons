package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_70 {
    private final Production40_70 production = new Production40_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}