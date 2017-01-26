package org.gradle.test.performance49_3;

import static org.junit.Assert.*;

public class Test49_277 {
    private final Production49_277 production = new Production49_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}