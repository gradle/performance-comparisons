package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_490 {
    private final Production58_490 production = new Production58_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}