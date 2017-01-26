package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_448 {
    private final Production58_448 production = new Production58_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}