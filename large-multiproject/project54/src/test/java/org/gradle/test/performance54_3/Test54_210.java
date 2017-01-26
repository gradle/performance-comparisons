package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_210 {
    private final Production54_210 production = new Production54_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}