package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_164 {
    private final Production54_164 production = new Production54_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}