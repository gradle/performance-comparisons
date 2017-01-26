package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_302 {
    private final Production40_302 production = new Production40_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}