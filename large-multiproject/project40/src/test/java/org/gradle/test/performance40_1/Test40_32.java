package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_32 {
    private final Production40_32 production = new Production40_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}