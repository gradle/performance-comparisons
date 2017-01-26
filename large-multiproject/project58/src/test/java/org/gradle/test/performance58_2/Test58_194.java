package org.gradle.test.performance58_2;

import static org.junit.Assert.*;

public class Test58_194 {
    private final Production58_194 production = new Production58_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}