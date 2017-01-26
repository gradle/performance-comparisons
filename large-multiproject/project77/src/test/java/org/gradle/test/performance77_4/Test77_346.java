package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_346 {
    private final Production77_346 production = new Production77_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}