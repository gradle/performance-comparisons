package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_129 {
    private final Production40_129 production = new Production40_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}