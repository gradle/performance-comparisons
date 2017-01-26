package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_23 {
    private final Production40_23 production = new Production40_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}