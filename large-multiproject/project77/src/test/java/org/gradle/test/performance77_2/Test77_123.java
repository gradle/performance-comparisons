package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_123 {
    private final Production77_123 production = new Production77_123("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}