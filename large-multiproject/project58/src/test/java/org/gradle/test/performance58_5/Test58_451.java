package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_451 {
    private final Production58_451 production = new Production58_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}