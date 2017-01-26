package org.gradle.test.performance62_3;

import static org.junit.Assert.*;

public class Test62_277 {
    private final Production62_277 production = new Production62_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}