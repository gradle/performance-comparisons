package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_277 {
    private final Production93_277 production = new Production93_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}