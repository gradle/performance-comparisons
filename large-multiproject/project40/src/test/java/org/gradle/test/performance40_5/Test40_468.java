package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_468 {
    private final Production40_468 production = new Production40_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}