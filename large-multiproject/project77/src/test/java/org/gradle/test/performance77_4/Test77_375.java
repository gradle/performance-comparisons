package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_375 {
    private final Production77_375 production = new Production77_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}