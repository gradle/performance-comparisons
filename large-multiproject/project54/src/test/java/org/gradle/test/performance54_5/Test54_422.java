package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_422 {
    private final Production54_422 production = new Production54_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}