package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_215 {
    private final Production54_215 production = new Production54_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}