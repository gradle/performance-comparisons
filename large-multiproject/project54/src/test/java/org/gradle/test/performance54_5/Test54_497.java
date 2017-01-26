package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_497 {
    private final Production54_497 production = new Production54_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}