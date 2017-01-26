package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_136 {
    private final Production40_136 production = new Production40_136("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}