package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_310 {
    private final Production40_310 production = new Production40_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}