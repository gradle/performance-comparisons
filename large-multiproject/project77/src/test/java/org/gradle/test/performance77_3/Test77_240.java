package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_240 {
    private final Production77_240 production = new Production77_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}