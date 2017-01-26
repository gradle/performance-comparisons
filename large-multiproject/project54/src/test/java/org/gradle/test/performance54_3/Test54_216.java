package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_216 {
    private final Production54_216 production = new Production54_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}