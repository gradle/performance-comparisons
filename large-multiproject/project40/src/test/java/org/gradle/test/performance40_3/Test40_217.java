package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_217 {
    private final Production40_217 production = new Production40_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}