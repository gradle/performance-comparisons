package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_91 {
    private final Production54_91 production = new Production54_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}