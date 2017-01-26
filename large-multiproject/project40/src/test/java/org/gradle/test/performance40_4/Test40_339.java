package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_339 {
    private final Production40_339 production = new Production40_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}