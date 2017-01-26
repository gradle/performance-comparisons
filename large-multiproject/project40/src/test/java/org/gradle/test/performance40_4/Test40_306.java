package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_306 {
    private final Production40_306 production = new Production40_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}