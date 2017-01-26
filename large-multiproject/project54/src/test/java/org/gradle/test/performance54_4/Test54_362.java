package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_362 {
    private final Production54_362 production = new Production54_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}