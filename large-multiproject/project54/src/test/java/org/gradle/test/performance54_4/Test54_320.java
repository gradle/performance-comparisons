package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_320 {
    private final Production54_320 production = new Production54_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}