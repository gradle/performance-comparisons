package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_435 {
    private final Production40_435 production = new Production40_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}