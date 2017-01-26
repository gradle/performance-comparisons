package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_409 {
    private final Production40_409 production = new Production40_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}