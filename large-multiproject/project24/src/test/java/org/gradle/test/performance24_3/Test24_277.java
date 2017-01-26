package org.gradle.test.performance24_3;

import static org.junit.Assert.*;

public class Test24_277 {
    private final Production24_277 production = new Production24_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}