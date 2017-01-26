package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_47 {
    private final Production54_47 production = new Production54_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}