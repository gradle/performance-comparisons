package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_418 {
    private final Production40_418 production = new Production40_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}