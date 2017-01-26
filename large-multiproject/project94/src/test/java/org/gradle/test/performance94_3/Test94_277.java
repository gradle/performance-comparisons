package org.gradle.test.performance94_3;

import static org.junit.Assert.*;

public class Test94_277 {
    private final Production94_277 production = new Production94_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}