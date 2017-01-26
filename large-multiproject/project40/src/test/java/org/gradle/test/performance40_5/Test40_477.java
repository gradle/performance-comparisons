package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_477 {
    private final Production40_477 production = new Production40_477("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}