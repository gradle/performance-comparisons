package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_453 {
    private final Production77_453 production = new Production77_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}