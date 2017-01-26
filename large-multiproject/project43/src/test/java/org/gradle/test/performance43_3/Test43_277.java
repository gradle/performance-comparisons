package org.gradle.test.performance43_3;

import static org.junit.Assert.*;

public class Test43_277 {
    private final Production43_277 production = new Production43_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}