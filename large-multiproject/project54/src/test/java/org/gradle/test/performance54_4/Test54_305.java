package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_305 {
    private final Production54_305 production = new Production54_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}