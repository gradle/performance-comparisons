package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_404 {
    private final Production40_404 production = new Production40_404("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}