package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_385 {
    private final Production77_385 production = new Production77_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}