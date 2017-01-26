package org.gradle.test.performance20_3;

import static org.junit.Assert.*;

public class Test20_277 {
    private final Production20_277 production = new Production20_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}