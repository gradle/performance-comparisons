package org.gradle.test.performance74_3;

import static org.junit.Assert.*;

public class Test74_277 {
    private final Production74_277 production = new Production74_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}