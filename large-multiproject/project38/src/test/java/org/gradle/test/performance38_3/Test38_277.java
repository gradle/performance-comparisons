package org.gradle.test.performance38_3;

import static org.junit.Assert.*;

public class Test38_277 {
    private final Production38_277 production = new Production38_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}