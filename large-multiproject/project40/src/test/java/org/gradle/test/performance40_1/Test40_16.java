package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_16 {
    private final Production40_16 production = new Production40_16("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}