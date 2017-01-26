package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_285 {
    private final Production54_285 production = new Production54_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}