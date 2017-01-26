package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_376 {
    private final Production58_376 production = new Production58_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}