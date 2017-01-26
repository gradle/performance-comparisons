package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_455 {
    private final Production40_455 production = new Production40_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}