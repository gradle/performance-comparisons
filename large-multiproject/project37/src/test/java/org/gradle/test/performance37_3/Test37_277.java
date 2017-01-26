package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_277 {
    private final Production37_277 production = new Production37_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}