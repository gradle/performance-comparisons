package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_430 {
    private final Production77_430 production = new Production77_430("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}