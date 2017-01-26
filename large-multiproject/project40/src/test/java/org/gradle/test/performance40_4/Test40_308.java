package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_308 {
    private final Production40_308 production = new Production40_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}