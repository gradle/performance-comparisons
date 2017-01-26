package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_471 {
    private final Production40_471 production = new Production40_471("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}