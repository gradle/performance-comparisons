package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_448 {
    private final Production77_448 production = new Production77_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}