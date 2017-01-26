package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_203 {
    private final Production54_203 production = new Production54_203("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}