package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_489 {
    private final Production40_489 production = new Production40_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}