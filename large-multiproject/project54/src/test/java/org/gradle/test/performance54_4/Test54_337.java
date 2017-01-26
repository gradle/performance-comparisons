package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_337 {
    private final Production54_337 production = new Production54_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}