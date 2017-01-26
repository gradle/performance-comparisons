package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_165 {
    private final Production40_165 production = new Production40_165("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}