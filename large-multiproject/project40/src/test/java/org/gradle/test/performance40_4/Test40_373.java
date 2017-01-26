package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_373 {
    private final Production40_373 production = new Production40_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}