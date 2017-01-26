package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_270 {
    private final Production54_270 production = new Production54_270("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}