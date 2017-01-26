package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_486 {
    private final Production40_486 production = new Production40_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}