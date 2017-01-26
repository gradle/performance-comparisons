package org.gradle.test.performance54_4;

import static org.junit.Assert.*;

public class Test54_392 {
    private final Production54_392 production = new Production54_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}