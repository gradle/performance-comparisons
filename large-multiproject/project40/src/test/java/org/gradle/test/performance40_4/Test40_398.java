package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_398 {
    private final Production40_398 production = new Production40_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}