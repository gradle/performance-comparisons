package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_287 {
    private final Production77_287 production = new Production77_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}