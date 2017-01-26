package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_376 {
    private final Production77_376 production = new Production77_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}