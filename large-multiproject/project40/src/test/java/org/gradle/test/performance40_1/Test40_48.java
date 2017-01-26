package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_48 {
    private final Production40_48 production = new Production40_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}