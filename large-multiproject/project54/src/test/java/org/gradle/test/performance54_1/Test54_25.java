package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_25 {
    private final Production54_25 production = new Production54_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}