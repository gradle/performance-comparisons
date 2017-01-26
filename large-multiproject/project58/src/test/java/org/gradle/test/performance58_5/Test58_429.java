package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_429 {
    private final Production58_429 production = new Production58_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}