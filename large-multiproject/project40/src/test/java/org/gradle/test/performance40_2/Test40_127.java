package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_127 {
    private final Production40_127 production = new Production40_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}