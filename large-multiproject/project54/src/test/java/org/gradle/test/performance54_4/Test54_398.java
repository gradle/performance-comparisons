package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_398 {
    private final Production54_398 production = new Production54_398("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}