package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_217 {
    private final Production54_217 production = new Production54_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}