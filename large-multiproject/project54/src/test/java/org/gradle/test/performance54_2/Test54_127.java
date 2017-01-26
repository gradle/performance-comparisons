package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_127 {
    private final Production54_127 production = new Production54_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}