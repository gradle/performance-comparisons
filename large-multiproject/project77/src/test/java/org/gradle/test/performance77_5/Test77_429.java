package org.gradle.test.performance77_5;

import static org.junit.Assert.*;

public class Test77_429 {
    private final Production77_429 production = new Production77_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}