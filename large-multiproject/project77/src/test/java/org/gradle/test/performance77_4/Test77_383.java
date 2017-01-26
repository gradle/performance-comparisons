package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_383 {
    private final Production77_383 production = new Production77_383("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}