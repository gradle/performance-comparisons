package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_359 {
    private final Production77_359 production = new Production77_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}