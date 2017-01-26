package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_277 {
    private final Production89_277 production = new Production89_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}