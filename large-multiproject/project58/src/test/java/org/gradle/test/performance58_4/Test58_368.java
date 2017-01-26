package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_368 {
    private final Production58_368 production = new Production58_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}