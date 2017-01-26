package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_377 {
    private final Production40_377 production = new Production40_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}