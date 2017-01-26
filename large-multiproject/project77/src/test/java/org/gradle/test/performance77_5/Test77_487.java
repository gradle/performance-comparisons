package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_487 {
    private final Production77_487 production = new Production77_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}