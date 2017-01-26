package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_36 {
    private final Production40_36 production = new Production40_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}