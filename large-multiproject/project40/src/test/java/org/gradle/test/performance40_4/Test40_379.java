package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_379 {
    private final Production40_379 production = new Production40_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}