package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_277 {
    private final Production5_277 production = new Production5_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}