package org.gradle.test.performance54_1;

import static org.junit.Assert.*;

public class Test54_90 {
    private final Production54_90 production = new Production54_90("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}