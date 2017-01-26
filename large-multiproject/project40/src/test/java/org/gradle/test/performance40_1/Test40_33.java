package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_33 {
    private final Production40_33 production = new Production40_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}