package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_211 {
    private final Production77_211 production = new Production77_211("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}