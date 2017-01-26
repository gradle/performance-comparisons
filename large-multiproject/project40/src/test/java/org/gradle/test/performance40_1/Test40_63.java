package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_63 {
    private final Production40_63 production = new Production40_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}