package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_122 {
    private final Production40_122 production = new Production40_122("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}