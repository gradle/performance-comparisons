package org.gradle.test.performance54_2;

import static org.junit.Assert.*;

public class Test54_186 {
    private final Production54_186 production = new Production54_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}