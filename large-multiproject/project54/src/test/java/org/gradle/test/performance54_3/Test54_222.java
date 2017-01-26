package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_222 {
    private final Production54_222 production = new Production54_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}