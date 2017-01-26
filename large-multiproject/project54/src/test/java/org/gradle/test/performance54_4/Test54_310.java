package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_310 {
    private final Production54_310 production = new Production54_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}