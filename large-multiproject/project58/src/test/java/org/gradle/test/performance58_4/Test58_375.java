package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_375 {
    private final Production58_375 production = new Production58_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}