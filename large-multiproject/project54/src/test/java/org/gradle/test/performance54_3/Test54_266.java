package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_266 {
    private final Production54_266 production = new Production54_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}