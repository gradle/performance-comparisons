package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_190 {
    private final Production40_190 production = new Production40_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}