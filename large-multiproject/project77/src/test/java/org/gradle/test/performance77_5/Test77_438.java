package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_438 {
    private final Production77_438 production = new Production77_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}