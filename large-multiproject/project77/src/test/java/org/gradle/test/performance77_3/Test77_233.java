package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_233 {
    private final Production77_233 production = new Production77_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}