package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_451 {
    private final Production77_451 production = new Production77_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}