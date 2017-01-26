package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_299 {
    private final Production58_299 production = new Production58_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}