package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_405 {
    private final Production40_405 production = new Production40_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}