package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_224 {
    private final Production54_224 production = new Production54_224("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}