package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_245 {
    private final Production4_245 production = new Production4_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}