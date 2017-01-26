package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_379 {
    private final Production54_379 production = new Production54_379("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}