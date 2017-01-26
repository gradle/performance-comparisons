package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_335 {
    private final Production77_335 production = new Production77_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}