package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_277 {
    private final Production77_277 production = new Production77_277("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}