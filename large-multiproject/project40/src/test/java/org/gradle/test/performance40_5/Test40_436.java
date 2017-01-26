package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_436 {
    private final Production40_436 production = new Production40_436("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}