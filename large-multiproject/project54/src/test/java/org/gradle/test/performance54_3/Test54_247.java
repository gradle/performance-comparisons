package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_247 {
    private final Production54_247 production = new Production54_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}