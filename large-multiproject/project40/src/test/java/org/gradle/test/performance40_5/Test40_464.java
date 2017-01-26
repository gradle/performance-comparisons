package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_464 {
    private final Production40_464 production = new Production40_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}