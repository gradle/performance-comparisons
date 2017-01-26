package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_177 {
    private final Production40_177 production = new Production40_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}