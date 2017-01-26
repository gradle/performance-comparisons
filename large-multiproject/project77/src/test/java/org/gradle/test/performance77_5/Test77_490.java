package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_490 {
    private final Production77_490 production = new Production77_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}