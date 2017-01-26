package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_321 {
    private final Production54_321 production = new Production54_321("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}