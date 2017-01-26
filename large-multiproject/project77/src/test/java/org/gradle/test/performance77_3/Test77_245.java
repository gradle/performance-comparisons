package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_245 {
    private final Production77_245 production = new Production77_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}