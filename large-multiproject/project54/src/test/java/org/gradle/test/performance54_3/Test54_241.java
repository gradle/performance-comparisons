package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_241 {
    private final Production54_241 production = new Production54_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}