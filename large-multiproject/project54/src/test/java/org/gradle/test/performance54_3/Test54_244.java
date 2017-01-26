package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_244 {
    private final Production54_244 production = new Production54_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}