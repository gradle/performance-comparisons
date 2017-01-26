package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_158 {
    private final Production54_158 production = new Production54_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}