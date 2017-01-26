package org.gradle.test.performance58_3;

import static org.junit.Assert.*;

public class Test58_277 {
    private final Production58_277 production = new Production58_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}