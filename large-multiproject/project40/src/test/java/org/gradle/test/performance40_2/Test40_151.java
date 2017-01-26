package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_151 {
    private final Production40_151 production = new Production40_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}