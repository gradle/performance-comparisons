package org.gradle.test.performance54_5;

import static org.junit.Assert.*;

public class Test54_431 {
    private final Production54_431 production = new Production54_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}