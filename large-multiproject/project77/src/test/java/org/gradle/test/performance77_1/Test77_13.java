package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_13 {
    private final Production77_13 production = new Production77_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}