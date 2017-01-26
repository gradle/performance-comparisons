package org.gradle.test.performance25_3;

import static org.junit.Assert.*;

public class Test25_277 {
    private final Production25_277 production = new Production25_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}