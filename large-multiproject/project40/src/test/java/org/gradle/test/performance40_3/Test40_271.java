package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_271 {
    private final Production40_271 production = new Production40_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}