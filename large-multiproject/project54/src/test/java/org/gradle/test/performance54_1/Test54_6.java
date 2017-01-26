package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_6 {
    private final Production54_6 production = new Production54_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}