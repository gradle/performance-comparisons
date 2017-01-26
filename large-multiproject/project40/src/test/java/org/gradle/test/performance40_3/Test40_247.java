package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_247 {
    private final Production40_247 production = new Production40_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}