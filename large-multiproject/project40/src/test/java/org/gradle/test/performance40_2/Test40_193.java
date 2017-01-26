package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_193 {
    private final Production40_193 production = new Production40_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}