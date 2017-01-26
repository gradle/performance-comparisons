package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_158 {
    private final Production40_158 production = new Production40_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}