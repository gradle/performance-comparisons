package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_143 {
    private final Production40_143 production = new Production40_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}