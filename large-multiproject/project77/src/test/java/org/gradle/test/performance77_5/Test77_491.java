package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_491 {
    private final Production77_491 production = new Production77_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}