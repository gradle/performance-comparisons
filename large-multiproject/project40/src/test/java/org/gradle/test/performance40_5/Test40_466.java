package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_466 {
    private final Production40_466 production = new Production40_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}