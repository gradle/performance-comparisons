package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_182 {
    private final Production40_182 production = new Production40_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}