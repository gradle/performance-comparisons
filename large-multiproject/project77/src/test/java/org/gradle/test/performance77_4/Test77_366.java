package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_366 {
    private final Production77_366 production = new Production77_366("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}