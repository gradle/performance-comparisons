package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_450 {
    private final Production40_450 production = new Production40_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}