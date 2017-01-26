package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_201 {
    private final Production40_201 production = new Production40_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}