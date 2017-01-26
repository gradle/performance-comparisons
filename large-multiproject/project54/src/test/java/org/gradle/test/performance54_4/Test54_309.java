package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_309 {
    private final Production54_309 production = new Production54_309("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}