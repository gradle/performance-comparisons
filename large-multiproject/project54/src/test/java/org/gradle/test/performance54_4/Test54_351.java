package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_351 {
    private final Production54_351 production = new Production54_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}