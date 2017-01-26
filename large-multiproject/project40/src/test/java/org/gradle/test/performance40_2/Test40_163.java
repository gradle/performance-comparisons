package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_163 {
    private final Production40_163 production = new Production40_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}