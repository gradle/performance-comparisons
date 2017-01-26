package org.gradle.test.performance40_1;

import static org.junit.Assert.*;

public class Test40_83 {
    private final Production40_83 production = new Production40_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}