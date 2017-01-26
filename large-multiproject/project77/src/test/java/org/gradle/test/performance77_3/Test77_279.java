package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_279 {
    private final Production77_279 production = new Production77_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}