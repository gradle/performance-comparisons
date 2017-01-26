package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_50 {
    private final Production77_50 production = new Production77_50("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}