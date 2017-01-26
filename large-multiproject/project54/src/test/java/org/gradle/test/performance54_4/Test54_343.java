package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_343 {
    private final Production54_343 production = new Production54_343("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}