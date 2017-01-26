package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_354 {
    private final Production40_354 production = new Production40_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}