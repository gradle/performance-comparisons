package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_357 {
    private final Production40_357 production = new Production40_357("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}