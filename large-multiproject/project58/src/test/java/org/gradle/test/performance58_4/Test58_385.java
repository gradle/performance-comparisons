package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_385 {
    private final Production58_385 production = new Production58_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}