package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_244 {
    private final Production40_244 production = new Production40_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}