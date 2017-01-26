package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_262 {
    private final Production77_262 production = new Production77_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}