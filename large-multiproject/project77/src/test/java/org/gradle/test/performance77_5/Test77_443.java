package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_443 {
    private final Production77_443 production = new Production77_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}