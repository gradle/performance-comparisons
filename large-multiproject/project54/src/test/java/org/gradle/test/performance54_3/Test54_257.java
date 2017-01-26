package org.gradle.test.performance54_3;

import static org.junit.Assert.*;

public class Test54_257 {
    private final Production54_257 production = new Production54_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}