package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_277 {
    private final Production50_277 production = new Production50_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}