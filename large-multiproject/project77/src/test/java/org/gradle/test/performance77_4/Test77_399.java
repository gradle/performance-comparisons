package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_399 {
    private final Production77_399 production = new Production77_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}