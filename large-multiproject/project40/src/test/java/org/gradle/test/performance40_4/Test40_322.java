package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_322 {
    private final Production40_322 production = new Production40_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}