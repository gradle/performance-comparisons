package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_391 {
    private final Production77_391 production = new Production77_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}