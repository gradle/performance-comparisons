package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_423 {
    private final Production40_423 production = new Production40_423("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}