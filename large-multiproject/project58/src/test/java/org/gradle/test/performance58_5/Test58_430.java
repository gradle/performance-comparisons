package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_430 {
    private final Production58_430 production = new Production58_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}