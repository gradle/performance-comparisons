package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_242 {
    private final Production40_242 production = new Production40_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}