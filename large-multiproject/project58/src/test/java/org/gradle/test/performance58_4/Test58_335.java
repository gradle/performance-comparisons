package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_335 {
    private final Production58_335 production = new Production58_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}