package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_245 {
    private final Production58_245 production = new Production58_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}