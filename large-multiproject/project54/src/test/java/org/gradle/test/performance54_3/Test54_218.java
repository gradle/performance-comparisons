package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_218 {
    private final Production54_218 production = new Production54_218("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}