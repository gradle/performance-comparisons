package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_482 {
    private final Production40_482 production = new Production40_482("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}