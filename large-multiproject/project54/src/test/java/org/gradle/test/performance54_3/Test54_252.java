package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_252 {
    private final Production54_252 production = new Production54_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}