package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_317 {
    private final Production54_317 production = new Production54_317("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}