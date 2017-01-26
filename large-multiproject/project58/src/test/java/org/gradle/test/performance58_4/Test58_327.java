package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_327 {
    private final Production58_327 production = new Production58_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}