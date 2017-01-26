package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_141 {
    private final Production77_141 production = new Production77_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}