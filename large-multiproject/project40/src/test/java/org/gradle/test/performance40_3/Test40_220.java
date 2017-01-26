package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_220 {
    private final Production40_220 production = new Production40_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}