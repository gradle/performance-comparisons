package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_109 {
    private final Production40_109 production = new Production40_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}