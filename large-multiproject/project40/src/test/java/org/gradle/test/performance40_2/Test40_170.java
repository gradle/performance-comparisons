package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_170 {
    private final Production40_170 production = new Production40_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}