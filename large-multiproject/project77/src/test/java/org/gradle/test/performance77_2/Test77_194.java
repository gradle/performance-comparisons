package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_194 {
    private final Production77_194 production = new Production77_194("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}