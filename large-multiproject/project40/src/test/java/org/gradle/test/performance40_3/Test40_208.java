package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_208 {
    private final Production40_208 production = new Production40_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}