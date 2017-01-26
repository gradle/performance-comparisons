package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_50 {
    private final Production58_50 production = new Production58_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}