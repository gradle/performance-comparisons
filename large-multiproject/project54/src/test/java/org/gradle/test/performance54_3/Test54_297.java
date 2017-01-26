package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_297 {
    private final Production54_297 production = new Production54_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}