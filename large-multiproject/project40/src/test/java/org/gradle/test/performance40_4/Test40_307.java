package org.gradle.test.performance40_4;

import static org.junit.Assert.*;

public class Test40_307 {
    private final Production40_307 production = new Production40_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}