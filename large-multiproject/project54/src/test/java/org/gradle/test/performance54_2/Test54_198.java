package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_198 {
    private final Production54_198 production = new Production54_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}