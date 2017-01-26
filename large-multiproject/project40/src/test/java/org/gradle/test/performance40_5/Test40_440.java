package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_440 {
    private final Production40_440 production = new Production40_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}