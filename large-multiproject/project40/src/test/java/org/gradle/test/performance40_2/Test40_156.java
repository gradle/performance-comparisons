package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_156 {
    private final Production40_156 production = new Production40_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}