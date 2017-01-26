package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_46 {
    private final Production40_46 production = new Production40_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}