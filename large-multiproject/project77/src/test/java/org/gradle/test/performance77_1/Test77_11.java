package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_11 {
    private final Production77_11 production = new Production77_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}