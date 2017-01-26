package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_31 {
    private final Production40_31 production = new Production40_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}