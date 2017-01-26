package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_277 {
    private final Production3_277 production = new Production3_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}