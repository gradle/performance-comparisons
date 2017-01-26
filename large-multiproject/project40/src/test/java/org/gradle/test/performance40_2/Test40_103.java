package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_103 {
    private final Production40_103 production = new Production40_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}