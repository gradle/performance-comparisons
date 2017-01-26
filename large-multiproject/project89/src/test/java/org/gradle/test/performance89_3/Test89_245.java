package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_245 {
    private final Production89_245 production = new Production89_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}