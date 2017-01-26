package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_125 {
    private final Production77_125 production = new Production77_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}