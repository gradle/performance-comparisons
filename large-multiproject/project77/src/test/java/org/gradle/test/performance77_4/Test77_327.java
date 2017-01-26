package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_327 {
    private final Production77_327 production = new Production77_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}