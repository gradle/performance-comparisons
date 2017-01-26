package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_421 {
    private final Production54_421 production = new Production54_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}