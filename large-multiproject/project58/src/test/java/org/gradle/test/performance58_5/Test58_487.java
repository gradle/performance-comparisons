package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_487 {
    private final Production58_487 production = new Production58_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}