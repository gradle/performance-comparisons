package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_360 {
    private final Production54_360 production = new Production54_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}