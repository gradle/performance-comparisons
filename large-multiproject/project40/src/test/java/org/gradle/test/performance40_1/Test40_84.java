package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_84 {
    private final Production40_84 production = new Production40_84("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}