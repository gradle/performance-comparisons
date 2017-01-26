package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_284 {
    private final Production77_284 production = new Production77_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}