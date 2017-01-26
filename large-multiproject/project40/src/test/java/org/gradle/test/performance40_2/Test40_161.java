package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_161 {
    private final Production40_161 production = new Production40_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}