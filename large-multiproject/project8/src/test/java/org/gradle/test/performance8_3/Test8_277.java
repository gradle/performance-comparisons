package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_277 {
    private final Production8_277 production = new Production8_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}