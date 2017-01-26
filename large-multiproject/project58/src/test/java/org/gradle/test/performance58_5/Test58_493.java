package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_493 {
    private final Production58_493 production = new Production58_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}