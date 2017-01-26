package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_83 {
    private final Production54_83 production = new Production54_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}