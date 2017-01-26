package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_358 {
    private final Production54_358 production = new Production54_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}