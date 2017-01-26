package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_329 {
    private final Production54_329 production = new Production54_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}