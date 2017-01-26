package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_277 {
    private final Production7_277 production = new Production7_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}