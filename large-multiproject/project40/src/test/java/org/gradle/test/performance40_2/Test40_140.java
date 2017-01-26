package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_140 {
    private final Production40_140 production = new Production40_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}