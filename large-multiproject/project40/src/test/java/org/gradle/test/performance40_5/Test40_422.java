package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_422 {
    private final Production40_422 production = new Production40_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}